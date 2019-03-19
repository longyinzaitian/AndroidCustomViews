package com.example.customview.rvpg

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import butterknife.BindView
import butterknife.ButterKnife
import com.example.customview.BaseActivity
import com.example.customview.R

/**
 *
 *
 * @author husy
 * @date 2019/3/18
 */
class CorViewPagerActivity: BaseActivity() {

    @BindView(R.id.view_pager)
    lateinit var mViewPager: ViewPager

    @BindView(R.id.tab_layout)
    lateinit var mTabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cor_view_pager)
        mUnbinder = ButterKnife.bind(this)

        setViewPager()
    }

    override fun getToolbarTitle(): String {
        return resources.getString(R.string.cor_view_pager)
    }

    private fun setViewPager() {
        val fragments: List<Fragment> = listOfNotNull(PagerFragment(), PagerFragment(), PagerFragment())
        val pagerAdapter = ViewPagerAdapter(supportFragmentManager, fragments, this)
        for (item in fragments.indices) {
            mTabLayout.addTab(mTabLayout.newTab())

        }
        mTabLayout.setupWithViewPager(mViewPager, false)
        mViewPager.adapter = pagerAdapter
        for (item in fragments.indices) {
            mTabLayout.getTabAt(item)!!.text = resources.getString(com.example.customview.R.string.pager_title) + item
        }
    }
}