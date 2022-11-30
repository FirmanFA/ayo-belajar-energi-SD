package com.dz.ayobelajarenergi.material2.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentSecondMaterial12Binding

class SecondMaterial12Fragment :
    BaseFragment<FragmentSecondMaterial12Binding>(FragmentSecondMaterial12Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgBow?.let {
            Glide.with(this)
                .asGif()
                .load(R.raw.bow)
                .into(it)
        }

        binding.imgFood?.let {
            Glide.with(this)
                .asGif()
                .load(R.raw.food)
                .into(it)
        }

    }
}