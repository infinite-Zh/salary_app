package com.infinite.salaryapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.infinite.salaryapp.R
import kotlinx.android.synthetic.main.content_main.*

/**
 * @author kfzhangxu
 * Created on 2018/4/16.
 */
class BarChartFragment : BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.content_main, container, false)

        return view
    }
}