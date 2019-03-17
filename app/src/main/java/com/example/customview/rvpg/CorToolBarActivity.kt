package com.example.customview.rvpg

import android.os.Bundle
import android.support.v7.widget.RecyclerView
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
class CorToolBarActivity: BaseActivity() {

    @BindView(R.id.recycler_view)
    lateinit var recyclerList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cor_tool_bar)
        mUnbinder = ButterKnife.bind(this)
        setList()
    }

    override fun getToolbarTitle(): String {
        return resources.getString(R.string.cor_tool_bar)
    }

    private fun setList() {
        recyclerList.adapter = ListAdapter(this)
    }
}