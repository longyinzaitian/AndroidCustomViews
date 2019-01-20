package com.example.customview.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.customview.R;
import com.example.customview.jike.JikeLikeActivity;
import com.example.customview.rvpg.RvAndVpActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startJikeLike();
    }

    private void startJikeLike() {
        findViewById(R.id.btn_jike_like).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, JikeLikeActivity.class));
            }
        });

        findViewById(R.id.btn_rv_and_vp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RvAndVpActivity.class));
            }
        });
    }
}