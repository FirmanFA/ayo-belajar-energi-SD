package com.dz.ayobelajarenergi.material3.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentThirdMaterial15Binding

class ThirdMaterial15Fragment :
    BaseFragment<FragmentThirdMaterial15Binding>(FragmentThirdMaterial15Binding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgSunshine?.let { Glide.with(this).load(R.raw.sunshine).into(it) }
        binding.imgElectricity?.let { Glide.with(this).load(R.raw.electricity).into(it) }

    }

}