package com.mastercoding.tabapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.mastercoding.tabapp.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    val tabsArray = arrayOf("Books", "Games", "Movies")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewpager)
        val tablayout = findViewById<TabLayout>(R.id.tablayout)


        val my_adapter = ViewPagerAdapter(
            supportFragmentManager,
            lifecycle
        )
        viewPager.adapter = my_adapter


        // Connecting the viewpager with tab layout
        TabLayoutMediator(tablayout, viewPager) {
            tab, position -> tab.text = tabsArray[position]
        }.attach()




    }
}