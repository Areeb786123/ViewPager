package com.example.viewpager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.databinding.ItemLayoutBinding

class ViewPagerViewHolder(val binding: ItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private lateinit var list: ArrayList<String>
    private var position: Int? = null
    fun bind(
        list: ArrayList<String>,
        position: Int
    ) {
        this.list = list
        this.position = position
        binding.itemTextView.text = list[position]
    }

    companion object {
        fun from(parent: ViewGroup): ViewPagerViewHolder {
            return ViewPagerViewHolder(
                ItemLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )

            )
        }
    }
}
