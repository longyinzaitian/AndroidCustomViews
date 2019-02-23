package com.example.customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.customview.ui.view.CommonToolbar;

import java.security.interfaces.RSAKey;

import butterknife.Unbinder;

/**
 * @author husy
 * @date 2019/2/19
 */
public class BaseActivity extends AppCompatActivity {

    protected Unbinder mUnbinder;
    protected CommonToolbar mCommonToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.mCommonToolbar = findViewById(R.id.toolbar);
        this.setToolbar();
    }

    protected void setToolbar() {
        if (this.mCommonToolbar != null) {
            this.mCommonToolbar.setNavigationInfo((View v) -> finish());
            this.mCommonToolbar.setTitle(this.getToolbarTitle());
        }
    }

    protected String getToolbarTitle() {
        return getResources().getString(R.string.app_name);
    }

    @Override
    protected void onDestroy() {
        if (this.mUnbinder != null) {
            this.mUnbinder.unbind();
        }
        super.onDestroy();
    }
}
