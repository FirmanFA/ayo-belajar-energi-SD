package com.dz.ayobelajarenergi.material1.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentFirstMaterial7Part2Binding

class FirstMaterial7Part2Fragment :
    BaseFragment<FragmentFirstMaterial7Part2Binding>(FragmentFirstMaterial7Part2Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgFire?.let { Glide.with(this).load(R.raw.fire).into(it) }
        binding.imgElectricity?.let { Glide.with(this).load(R.raw.electricity).into(it) }
        binding.imgSun?.let { Glide.with(this).load(R.raw.sun).into(it) }

    }


}