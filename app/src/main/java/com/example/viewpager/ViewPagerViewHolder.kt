package com.example.viewpager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.databinding.ItemLayoutBinding

class ViewPagerViewHolder(private val binding: ItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private var list: Int? = null
    private var position: Int? = null
    fun bind(
        list: Int,
        position: Int
    ) {
        this.list = list
        this.position = position
        binding.itemTextView.text = list.toString()
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
