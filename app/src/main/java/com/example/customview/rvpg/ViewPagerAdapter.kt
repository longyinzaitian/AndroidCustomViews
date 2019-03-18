package com.example.customview.rvpg

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.customview.R

/**
 *
 *
 * @author husy
 * @date 2019/3/19
 */
class ViewPagerAdapter(fragmentManger: FragmentManager, fragments: List<Fragment>, context: Context): FragmentPagerAdapter(fragmentManger) {

    private var mFragments: List<Fragment> = fragments
    private val mContext: Context = context

    override fun getItem(p0: Int): Fragment {
        return mFragments[p0]
    }

//    override fun getPageTitle(position: Int): CharSequence? {
//        return mContext.getString(R.string.pager_title) + position
//    }

    override fun getCount(): Int {
        return mFragments.size
    }
}