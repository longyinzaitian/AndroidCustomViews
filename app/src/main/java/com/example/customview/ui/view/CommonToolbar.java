package com.example.customview.ui.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;

import com.example.customview.R;

/**
 * @author husy
 * @date 2019/2/17
 */
public class CommonToolbar extends Toolbar {
    public CommonToolbar(Context context) {
        super(context);
        this.init();
    }

    public CommonToolbar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.init();
    }

    public CommonToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.init();
    }

    private void init() {
        this.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
    }

    public void setNavigationInfo(View.OnClickListener onClickListener) {
        this.setNavigationIcon(R.drawable.mt_topbar_back_ic);
        this.setNavigationOnClickListener(onClickListener);
        this.setTitle(R.string.app_name);
        this.setTitleTextAppearance(getContext(), R.style.CommonBarTitleStyle);
        getChildAt(0).setVisibility(INVISIBLE);
    }
}
