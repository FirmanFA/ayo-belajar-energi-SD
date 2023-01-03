package com.dz.ayobelajarenergi.material3.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentThirdMaterial14Binding

class ThirdMaterial14Fragment :
    BaseFragment<FragmentThirdMaterial14Binding>(FragmentThirdMaterial14Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgSpeaker?.let { Glide.with(this).load(R.raw.speaker).into(it) }
        binding.imgHeat?.let { Glide.with(this).load(R.raw.fire).into(it) }

    }

}