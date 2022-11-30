package com.dz.ayobelajarenergi.material2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dz.ayobelajarenergi.material1.content.*
import com.dz.ayobelajarenergi.material2.content.*

class SecondMaterialAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = 14

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                SecondMaterial1Fragment()
            }
            1 -> {
                SecondMaterial2Fragment()
            }
            2 -> {
                SecondMaterial3Fragment()
            }
            3 -> {
                SecondMaterial4Fragment()
            }
            4->{
                SecondMaterial5Fragment()
            }
            5->{
                SecondMaterial6Fragment()
            }
            6->{
                SecondMaterial7Fragment()
            }
            7->{
                SecondMaterial8Fragment()
            }
            8->{
                SecondMaterial9Fragment()
            }
            9->{
                SecondMaterial10Fragment()
            }
            10->{
                SecondMaterial11Fragment()
            }
            11->{
                SecondMaterial12Fragment()
            }
            12->{
                SecondMaterial13Fragment()
            }
            13->{
                SecondMaterial14Fragment()
            }
            else -> {
                FirstMaterial1Fragment()
            }
        }
    }

}