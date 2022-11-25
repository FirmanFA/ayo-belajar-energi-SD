package com.dz.ayobelajarenergi.material1.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentFirstMaterial4Part3Binding

class FirstMaterial4Part3Fragment :
    BaseFragment<FragmentFirstMaterial4Part3Binding>(FragmentFirstMaterial4Part3Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgGuitar?.let { Glide.with(this).load(R.raw.guitar).into(it) }
        binding.imgMicrowave?.let { Glide.with(this).load(R.raw.microwave).into(it) }
        binding.imgTurbine?.let { Glide.with(this).load(R.raw.wind_turbine).into(it) }

    }

}