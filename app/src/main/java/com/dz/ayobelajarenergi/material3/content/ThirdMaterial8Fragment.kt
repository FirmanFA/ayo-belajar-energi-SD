package com.dz.ayobelajarenergi.material3.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentThirdMaterial8Binding

class ThirdMaterial8Fragment :
    BaseFragment<FragmentThirdMaterial8Binding>(FragmentThirdMaterial8Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgKinetic?.let { Glide.with(this).load(R.raw.solar_panel_2).into(it) }


    }


}