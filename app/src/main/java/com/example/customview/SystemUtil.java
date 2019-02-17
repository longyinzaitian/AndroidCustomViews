package com.example.customview;

import android.content.Context;
import android.util.TypedValue;

/**
 *
 *
 * @author husy
 * @date 2019年2月17日
 */
public class SystemUtil {
    /**
     * dp转px
     *
     */
    public static int dp2px(Context context,float dpVal){
        return (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,dpVal,context.getResources().getDisplayMetrics());
    }

    /**
     * sp转px
     *
     */
    public static int sp2px(Context context,float spVal){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,spVal,context.getResources().getDisplayMetrics());
    }

}
