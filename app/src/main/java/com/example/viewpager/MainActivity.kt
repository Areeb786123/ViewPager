package com.example.viewpager

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = activityBinding.root
        setContentView(view)
        Log.e("hello", "hello")
    }

    fun viewPager() {
        val list = arrayListOf<String>(
            "Areeb", "Mahi", "Zara", "Hania", "Hamira", "Alia", "Aalisa", "Umair", "Saif"
        )

        activityBinding.viewPager.apply {
            offscreenPageLimit = 3
            (getChildAt(0) as RecyclerView).overScrollMode =
                RecyclerView.OVER_SCROLL_NEVER
        }

        activityBinding.viewPager.adapter = ViewPagerAdapter(list)
    }
}
