package com.dz.ayobelajarenergi.material2.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentSecondMaterial11Binding

class SecondMaterial11Fragment :
    BaseFragment<FragmentSecondMaterial11Binding>(FragmentSecondMaterial11Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgWaterGenerator?.let {
            Glide.with(this).asGif().load(R.raw.water_generator).into(it)
        }

    }


}