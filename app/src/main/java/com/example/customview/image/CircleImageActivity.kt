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

    @BindView(R.id.android_round_image_center)
    lateinit var v4RoundImgCenter: ImageView

    @BindView(R.id.android_round_image_center_crop)
    lateinit var v4RoundImgCenterCrop: ImageView

    @BindView(R.id.android_round_image_center_matrix)
    lateinit var v4RoundImgMatrix: ImageView

    @BindView(R.id.android_round_image_centerInside)
    lateinit var v4RoundImgCenterInside: ImageView

    @BindView(R.id.android_round_image_fitCenter)
    lateinit var v4RoundImgFitCenter: ImageView

    @BindView(R.id.android_round_image_fitStart)
    lateinit var v4RoundImgFitStart: ImageView

    @BindView(R.id.android_round_image_fitEnd)
    lateinit var v4RoundImgFitEnd: ImageView

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
        setRoundImg(v4RoundImageView)
        setRoundImg(v4RoundImgCenter)
        setRoundImg(v4RoundImgCenterCrop)
        setRoundImg(v4RoundImgMatrix)
        setRoundImg(v4RoundImgCenterInside)
        setRoundImg(v4RoundImgFitCenter)
        setRoundImg(v4RoundImgFitStart)
        setRoundImg(v4RoundImgFitEnd)
    }

    private fun setRoundImg(imageView: ImageView) {
        val roundDra: RoundedBitmapDrawable = RoundedBitmapDrawableFactory.create(resources,
                BitmapFactory.decodeResource(resources, R.drawable.img_e_commerce_item))
        roundDra.cornerRadius = resources.getDimension(R.dimen.dimens_20dp)

        imageView.setImageDrawable(roundDra)
    }
}
