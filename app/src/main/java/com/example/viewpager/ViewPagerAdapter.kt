package com.example.viewpager

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

class ViewPagerAdapter : ListAdapter<Int, ViewPagerViewHolder>(DiffCallBack()) {

    private class DiffCallBack : DiffUtil.ItemCallback<Int>() {
        override fun areItemsTheSame(oldItem: Int, newItem: Int): Boolean = oldItem == newItem
        override fun areContentsTheSame(oldItem: Int, newItem: Int): Boolean = oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        return ViewPagerViewHolder.from(parent)
    }

    override fun onBindViewHolder(viewHolder: ViewPagerViewHolder, position: Int) {
        viewHolder.bind(
            getItem(position),
            position
        )
    }
}
