package com.example.customview.jike;

import android.os.Bundle;

import com.example.customview.BaseActivity;
import com.example.customview.R;

/**
 *
 *
 * @author husy
 * @date 2019年2月17日22:52:59
 */
public class JikeLikeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jike_like);
    }

    @Override
    protected String getToolbarTitle() {
        return getResources().getString(R.string.jike);
    }
}
