package com.dz.ayobelajarenergi.material1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dz.ayobelajarenergi.material1.content.*

class FirstMaterialAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount() = 15

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                FirstMaterial1Fragment()
            }
            1 -> {
                FirstMaterial2Fragment()
            }
            2 -> {
                FirstMaterial2Part2Fragment()
            }
            3 -> {
                FirstMaterial3Fragment()
            }
            4->{
                FirstMaterial4Fragment()
            }
            5->{
                FirstMaterial4Part2Fragment()
            }
            6->{
                FirstMaterial4Part3Fragment()
            }
            7->{
                FirstMaterial5Fragment()
            }
            8->{
                FirstMaterial5Part2Fragment()
            }
            9->{
                FirstMaterial6Fragment()
            }
            10->{
                FirstMaterial6Part2Fragment()
            }
            11->{
                FirstMaterial7Fragment()
            }
            12->{
                FirstMaterial7Part2Fragment()
            }
            13->{
                FirstMaterial7Part3Fragment()
            }
            14->{
                FirstMaterial8Fragment()
            }
            else -> {
                FirstMaterial1Fragment()
            }
        }
    }

}