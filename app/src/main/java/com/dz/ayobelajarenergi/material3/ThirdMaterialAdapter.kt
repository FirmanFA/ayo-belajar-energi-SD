package com.dz.ayobelajarenergi.material3

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dz.ayobelajarenergi.material1.content.*
import com.dz.ayobelajarenergi.material2.content.*
import com.dz.ayobelajarenergi.material3.content.*

class ThirdMaterialAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = 16

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                ThirdMaterial1Fragment()
            }
            1 -> {
                ThirdMaterial2Fragment()
            }
            2 -> {
                ThirdMaterial3Fragment()
            }
            3 -> {
                ThirdMaterial4Fragment()
            }
            4->{
                ThirdMaterial5Fragment()
            }
            5->{
                ThirdMaterial6Fragment()
            }
            6->{
                ThirdMaterial7Fragment()
            }
            7->{
                ThirdMaterial8Fragment()
            }
            8->{
                ThirdMaterial9Fragment()
            }
            9->{
                ThirdMaterial10Fragment()
            }
            10->{
                ThirdMaterial11Fragment()
            }
            11->{
                ThirdMaterial12Fragment()
            }
            12->{
                ThirdMaterial13Fragment()
            }
            13->{
                ThirdMaterial14Fragment()
            }
            14->{
                ThirdMaterial15Fragment()
            }
            15->{
                ThirdMaterial16Fragment()
            }
            else -> {
                ThirdMaterial1Fragment()
            }
        }
    }

}