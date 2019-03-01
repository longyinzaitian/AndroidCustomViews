package com.example.customview.rvpg;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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

    private ListAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cor_normal);
        this.mUnbinder = ButterKnife.bind(this);

        setData();
    }

    private void setData() {
        if (mAdapter == null) {
            mAdapter = new ListAdapter(CorNormalActivity.this);
        }
        mRecyclerView.setLayoutManager(new LinearLayoutManager(CorNormalActivity.this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(CorNormalActivity.this, DividerItemDecoration.HORIZONTAL));
        mRecyclerView.setAdapter(mAdapter);
    }
}
