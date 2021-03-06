package com.example.customview.rvpg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.customview.R;
import com.example.customview.ui.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *
 *
 * @author husy
 * @date 2019年2月17日
 */
public class RvAndVpFragment extends BaseFragment {

    @BindView(R.id.btn_normal)
    Button btnNormal;

    @BindView(R.id.btn_fix_scroll)
    Button btnFixScroll;

    @BindView(R.id.btn_normal_toolbar)
    Button btnToolbar;

    @BindView(R.id.btn_normal_tab)
    Button btnViewPager;

    private static RvAndVpFragment mInstance = null;
    public RvAndVpFragment() {
    }

    public static Fragment create() {
        if (mInstance == null) {
            mInstance = RvAndVpFragment.newInstance();
        }
        return mInstance;
    }

    public static RvAndVpFragment newInstance() {
        RvAndVpFragment fragment = new RvAndVpFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_card_detail, container, false);
        this.mUnbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnNormal.setOnClickListener((View v) -> startActivity(new Intent(getContext(), CorNormalActivity.class)));
        btnToolbar.setOnClickListener((View v) -> startActivity(new Intent(getContext(), CorToolBarActivity.class)));
        btnViewPager.setOnClickListener((View v) -> startActivity(new Intent(getContext(), CorViewPagerActivity.class)));
        btnFixScroll.setOnClickListener((View v) -> startActivity(new Intent(getContext(), FixBehaviorActivity.class)));
    }
}
