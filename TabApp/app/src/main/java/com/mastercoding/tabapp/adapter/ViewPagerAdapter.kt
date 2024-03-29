package com.mastercoding.tabapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mastercoding.tabapp.fragments.BooksFragment
import com.mastercoding.tabapp.fragments.GamesFragment
import com.mastercoding.tabapp.fragments.MoviesFragment

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return BooksFragment()
            1 -> return GamesFragment()
        }
        return MoviesFragment()
    }
}