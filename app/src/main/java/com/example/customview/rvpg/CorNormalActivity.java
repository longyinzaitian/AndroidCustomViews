package com.example.customview.rvpg;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

import com.example.customview.BaseActivity;
import com.example.customview.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author husy
 * @date 2019/2/21
 */
public class CorNormalActivity extends BaseActivity {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    @BindView(R.id.appbar)
    AppBarLayout mAppBarLayout;

    @BindView(R.id.search_rl)
    RelativeLayout searchRl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cor_normal);
        this.mUnbinder = ButterKnife.bind(this);

        setData();
        setListener();
    }

    private void setData() {
        ListAdapter mAdapter = new ListAdapter(CorNormalActivity.this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(CorNormalActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(CorNormalActivity.this, DividerItemDecoration.VERTICAL);
        Drawable drawable = ContextCompat.getDrawable(CorNormalActivity.this, R.drawable.item_divider);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        mRecyclerView.addItemDecoration(dividerItemDecoration);
    }

    private void setListener() {
        searchRl.setBackgroundColor(ContextCompat.getColor(CorNormalActivity.this,R.color.search_bg));
        int searchBarH = getResources().getDimensionPixelSize(R.dimen.dimens_80dp);
        mAppBarLayout.addOnOffsetChangedListener((AppBarLayout appBarLayout, int verticalOffset) -> {
            float per = (Math.abs(verticalOffset + 0.0f)) / searchBarH;
            if (per > 1) {
                per = 1;
            }
            searchRl.getBackground().setAlpha((int)(100 * per));
        });
    }
}
