package com.example.customview.rvpg;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.customview.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author husy
 * @date 2019/3/1
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Holder> {

    private static int[] SRC_ARR = {R.drawable.message_like_ic, R.drawable.message_comment_ic,
                                    R.drawable.message_fans_ic, R.drawable.message_system_ic};

    private Context mContext;
    public ListAdapter(Context context) {
        this.mContext = context;
    }

    @NonNull
    @Override
    public ListAdapter.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Holder(LayoutInflater.from(mContext).inflate(R.layout.item_list_adapter, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.Holder viewHolder, int i) {
        int index = viewHolder.getAdapterPosition();

        viewHolder.itemSrc.setImageDrawable(ContextCompat.getDrawable(mContext, SRC_ARR[index % SRC_ARR.length]));
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    static class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_list_src)
        ImageView itemSrc;

        public Holder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
