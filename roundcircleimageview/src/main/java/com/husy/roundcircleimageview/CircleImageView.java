package com.husy.roundcircleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.TypedValue;

/**
 * @author husy
 * @date 2019/2/23
 */
public class CircleImageView extends AppCompatImageView {

    private CircleDrawable mCircleDrawable;

    public CircleImageView(Context context) {
        this(context, null);
    }

    public CircleImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        final TypedArray a = context.obtainStyledAttributes(
                attrs, R.styleable.CircleImageView, defStyleAttr, defStyleAttr);
        int srcId = a.getResourceId(R.styleable.CircleImageView_src, 0);

        TypedValue typedValue = a.peekValue(R.styleable.CircleImageView_corner);
        float corner = 0;
        if (typedValue.type == TypedValue.TYPE_DIMENSION) {
            corner = a.getDimensionPixelSize(R.styleable.CircleImageView_corner, (int)TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, 0, getResources().getDisplayMetrics()));
        } else if (typedValue.type == TypedValue.TYPE_INT_DEC) {
            corner = a.getInt(R.styleable.CircleImageView_corner, 0);
        }
        a.recycle();

        if (srcId != 0) {
            mCircleDrawable = new CircleDrawable(BitmapFactory.decodeResource(getResources(), srcId), corner);
        }

        setImageDrawable(mCircleDrawable);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    private class CircleDrawable extends Drawable {

        private Bitmap mBitmap;
        private Paint mPaint;
        private RectF mRect;
        private float mCorner;

        public CircleDrawable(Bitmap bitmap, float corner) {
            mBitmap = bitmap;
            mPaint = new Paint();
            mPaint.setAntiAlias(true);
            mCorner = corner;
        }

        @Override
        public void setAlpha(int alpha) {
            mPaint.setAlpha(alpha);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            mPaint.setColorFilter(colorFilter);
        }

        @Override
        public int getOpacity() {
            return PixelFormat.TRANSLUCENT;
        }

        @Override
        public void setBounds(int left, int top, int right, int bottom) {
            super.setBounds(left, top, right, bottom);
            mPaint.setShader(new BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            mRect = new RectF(left, top, right, bottom);
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawRoundRect(mRect, mCorner, mCorner, mPaint);
        }
    }
}

