package com.example.customview.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.customview.BaseActivity;
import com.example.customview.R;
import com.example.customview.jike.JikeLikeActivity;
import com.example.customview.rvpg.RvAndVpActivity;

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

    private void setClickListener() {
        findViewById(R.id.btn_jike_like).setOnClickListener((View v) ->
            startActivity(new Intent(MainActivity.this, JikeLikeActivity.class))
        );

        findViewById(R.id.btn_rv_and_vp).setOnClickListener((View v) ->
                startActivity(new Intent(MainActivity.this, RvAndVpActivity.class))
        );
    }
}
