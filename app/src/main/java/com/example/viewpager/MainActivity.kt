package com.example.viewpager

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityBinding: ActivityMainBinding
    private lateinit var viewAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = activityBinding.root
        setContentView(view)
        Log.e("hello", "hello")
        viewPager()
    }

    fun viewPager() {
        val list = listOf<Int>(1, 2, 4, 5)
        viewAdapter = ViewPagerAdapter()
        activityBinding.viewPager.adapter = viewAdapter
        viewAdapter.submitList(list)
    }
}
