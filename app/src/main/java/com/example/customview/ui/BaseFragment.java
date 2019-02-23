package com.example.customview.ui;

import android.support.v4.app.Fragment;

import butterknife.Unbinder;

/**
 * @author husy
 * @date 2019/2/21
 */
public class BaseFragment extends Fragment {
    protected Unbinder mUnbinder = null;

    @Override
    public void onDestroy() {
        if (this.mUnbinder != null) {
            this.mUnbinder.unbind();
        }
        super.onDestroy();
    }

}
