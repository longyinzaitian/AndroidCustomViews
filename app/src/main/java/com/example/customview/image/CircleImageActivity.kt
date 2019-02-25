package com.example.customview.image

import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawable
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.widget.ImageView
import butterknife.BindView
import butterknife.ButterKnife
import com.example.customview.BaseActivity
import com.example.customview.R

class CircleImageActivity : BaseActivity() {

    @BindView(R.id.android_round_image)
    lateinit var v4RoundImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_image)
        this.mUnbinder = ButterKnife.bind(this)

        v4RoundImageView()
    }

    override fun getToolbarTitle(): String {
        return resources.getString(R.string.circle_image)
    }

    private fun v4RoundImageView() {
        val roundDra: RoundedBitmapDrawable = RoundedBitmapDrawableFactory.create(resources,
                BitmapFactory.decodeResource(resources, R.drawable.img_e_commerce_item))
        roundDra.cornerRadius = resources.getDimension(R.dimen.dimens_20dp)

        v4RoundImageView.setImageDrawable(roundDra)
    }
}
