package com.dz.ayobelajarenergi.material1.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentFirstMaterial7Binding


class FirstMaterial7Fragment :
    BaseFragment<FragmentFirstMaterial7Binding>(FragmentFirstMaterial7Binding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgGuitar?.let { Glide.with(this).load(R.raw.guitar).into(it) }
        binding.imgFootball?.let { Glide.with(this).load(R.raw.football).into(it) }
        binding.imgBattery?.let { Glide.with(this).load(R.raw.battery).into(it) }

    }

}