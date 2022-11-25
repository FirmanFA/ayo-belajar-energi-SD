package com.dz.ayobelajarenergi.material1.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentFirstMaterial7Part3Binding

class FirstMaterial7Part3Fragment :
    BaseFragment<FragmentFirstMaterial7Part3Binding>(FragmentFirstMaterial7Part3Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.imgGuitar2?.let { Glide.with(this).load(R.raw.guitar).into(it) }
        binding.imgFootball2?.let { Glide.with(this).load(R.raw.football).into(it) }

    }

}