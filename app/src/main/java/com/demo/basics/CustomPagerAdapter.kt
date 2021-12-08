package com.demo.basics

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup

class CustomPagerAdapter(context: Context) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        
        return super.instantiateItem(container, position)
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun isViewFromObject(p0: View, p1: Any): Boolean {
        TODO("Not yet implemented")
    }
}