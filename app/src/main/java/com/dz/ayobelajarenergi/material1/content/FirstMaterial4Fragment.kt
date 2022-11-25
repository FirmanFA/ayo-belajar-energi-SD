package com.dz.ayobelajarenergi.material1.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentFirstMaterial4Binding

class FirstMaterial4Fragment :
    BaseFragment<FragmentFirstMaterial4Binding>(FragmentFirstMaterial4Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.imgLamp?.let { Glide.with(this).load(R.raw.lamp).into(it) }


    }


}