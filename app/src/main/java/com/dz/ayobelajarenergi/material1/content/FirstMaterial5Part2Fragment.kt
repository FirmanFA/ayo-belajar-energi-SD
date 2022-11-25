package com.dz.ayobelajarenergi.material1.content

import android.graphics.drawable.Animatable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentFirstMaterial5Part2Binding
import smartdevelop.ir.eram.showcaseviewlib.GuideView
import smartdevelop.ir.eram.showcaseviewlib.config.DismissType

class FirstMaterial5Part2Fragment :
    BaseFragment<FragmentFirstMaterial5Part2Binding>(FragmentFirstMaterial5Part2Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgInformation?.let { Glide.with(this).asGif().load(R.raw.information).into(it) }

        binding.imgInformation?.setOnClickListener {

            GuideView.Builder(context).setTitle("Kosakata Baru")
                .setContentText(
                    "panel: papan\nsurya: matahari\npanel surya: alat berbentuk papan yang " +
                            "berfungsi mengubah energi \n" +
                            "cahaya matahari menjadi listrik."
                )
                .setTargetView(it)
                .setDismissType(DismissType.anywhere)
                .build().show()

            val drawable = binding.imgInformation!!.drawable
            if (drawable is Animatable) {
                (drawable as Animatable).stop()
            }

        }

        binding.imgSolarPanel?.let { Glide.with(this).load(R.raw.solar_panel).into(it) }

    }
}