package com.example.customview.image

import android.os.Bundle
import butterknife.ButterKnife
import com.example.customview.BaseActivity
import com.example.customview.R

class CircleImageActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_image)
        this.mUnbinder = ButterKnife.bind(this)
    }

    override fun getToolbarTitle(): String {
        return resources.getString(R.string.circle_image)
    }
}
