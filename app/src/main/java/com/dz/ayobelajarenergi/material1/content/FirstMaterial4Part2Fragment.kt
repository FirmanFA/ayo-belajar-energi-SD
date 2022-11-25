package com.dz.ayobelajarenergi.material1.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentFirstMaterial4Part2Binding

class FirstMaterial4Part2Fragment :
    BaseFragment<FragmentFirstMaterial4Part2Binding>(FragmentFirstMaterial4Part2Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgFootball?.let { Glide.with(this).load(R.raw.football).into(it) }
        binding.imgFan?.let { Glide.with(this).load(R.raw.fan).into(it) }
        binding.imgTv?.let { Glide.with(this).load(R.raw.television).into(it) }

    }


}