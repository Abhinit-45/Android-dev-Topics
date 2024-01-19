package com.mastercoding.viewpagerapp.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mastercoding.viewpagerapp.MainActivity
import com.mastercoding.viewpagerapp.fragments.FragmentOne
import com.mastercoding.viewpagerapp.fragments.FragmentThree
import com.mastercoding.viewpagerapp.fragments.FragmentTwo

class MyAdapter(mainActivity: MainActivity): FragmentStateAdapter(mainActivity) {

    private val Fragments_Size = 3

    override fun getItemCount(): Int {
        return this.Fragments_Size
    }

    override fun createFragment(position: Int): Fragment {

        when(position){
            0 -> {
                return FragmentOne()
            }
            1 -> {
                return FragmentTwo()
            }
            2 -> {
                return FragmentThree()
            }
        }
        return FragmentOne()
    }


}