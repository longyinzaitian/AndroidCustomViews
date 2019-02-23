package com.example.customview.rvpg;

import android.os.Bundle;

import com.example.customview.BaseActivity;
import com.example.customview.R;

/**
 *
 *
 * @author husy
 * @date 2019年2月17日22:52:59
 */
public class RvAndVpActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_and_vp);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content,
                RvAndVpFragment.create())
                .commitNowAllowingStateLoss();
    }

    @Override
    protected String getToolbarTitle() {
        return getResources().getString(R.string.coord);
    }
}
