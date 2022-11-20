package com.example.viewpager

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private val itemList: ArrayList<String>) :
    RecyclerView.Adapter<ViewPagerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        return ViewPagerViewHolder.from(parent)
    }

    override fun onBindViewHolder(viewHolder: ViewPagerViewHolder, position: Int) {
        viewHolder.bind(
            itemList,
            position
        )
    }

    override fun getItemCount(): Int = itemList.size
}
