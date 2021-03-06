package com.example.customview.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.customview.BaseActivity;
import com.example.customview.R;
import com.example.customview.image.CircleImageActivity;
import com.example.customview.jike.JikeLikeActivity;
import com.example.customview.rvpg.RvAndVpActivity;
import com.example.customview.service.TestAidlActivity;

/**
 *
 *
 * @author husy
 * @date 2019年2月17日
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setClickListener();
    }

    @Override
    protected void setToolbar() {

    }

    private void setClickListener() {
        findViewById(R.id.btn_jike_like).setOnClickListener((View v) ->
            startActivity(new Intent(MainActivity.this, JikeLikeActivity.class))
        );

        findViewById(R.id.btn_rv_and_vp).setOnClickListener((View v) ->
                startActivity(new Intent(MainActivity.this, RvAndVpActivity.class))
        );

        findViewById(R.id.btn_circle_image).setOnClickListener((View v) ->
                startActivity(new Intent(MainActivity.this, CircleImageActivity.class))
        );

        findViewById(R.id.btn_test_aidl).setOnClickListener((View v) ->
                startActivity(new Intent(MainActivity.this, TestAidlActivity.class))
        );
    }
}
