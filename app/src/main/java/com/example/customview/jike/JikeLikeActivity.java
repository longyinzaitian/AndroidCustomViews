package com.example.customview.jike;

import android.os.Bundle;
import android.view.View;

import com.example.customview.BaseActivity;
import com.example.customview.R;
import com.example.customview.ui.view.CommonToolbar;

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
        this.setListener();
    }

    private void setListener() {
        ((CommonToolbar)findViewById(R.id.toolbar)).setNavigationInfo((View v) ->
                finish()
        );
    }
}
