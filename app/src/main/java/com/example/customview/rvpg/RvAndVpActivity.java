package com.example.customview.rvpg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.customview.R;

public class RvAndVpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_and_vp);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content,
                CardDetailFragment.create())
                .commitNowAllowingStateLoss();

    }
}
