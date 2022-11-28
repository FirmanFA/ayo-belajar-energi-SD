package com.dz.ayobelajarenergi.material2.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentSecondMaterial4Binding

class SecondMaterial4Fragment :
    BaseFragment<FragmentSecondMaterial4Binding>(FragmentSecondMaterial4Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgFallingFruit?.let { Glide.with(this).load(R.raw.falling_fruit).into(it) }

    }

}