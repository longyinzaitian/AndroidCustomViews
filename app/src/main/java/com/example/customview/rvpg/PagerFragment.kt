package com.example.customview.rvpg

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.BindView
import butterknife.ButterKnife
import com.example.customview.R
import com.example.customview.ui.BaseFragment

/**
 *
 *
 * @author husy
 * @date 2019/2/21
 */
class PagerFragment: BaseFragment() {

    @BindView(R.id.recycler_view)
    lateinit var recyclerList: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = layoutInflater.inflate(R.layout.fragment_pager, container, false)
        mUnbinder = ButterKnife.bind(this, v)
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setList()
    }

    private fun setList() {
        recyclerList.adapter = ListAdapter(context)
    }
}