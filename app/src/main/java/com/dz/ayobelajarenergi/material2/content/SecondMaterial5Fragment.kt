package com.dz.ayobelajarenergi.material2.content

import android.graphics.drawable.Animatable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentSecondMaterial5Binding
import smartdevelop.ir.eram.showcaseviewlib.GuideView
import smartdevelop.ir.eram.showcaseviewlib.config.DismissType


class SecondMaterial5Fragment :
    BaseFragment<FragmentSecondMaterial5Binding>(FragmentSecondMaterial5Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgInformation?.let { Glide.with(this).asGif().load(R.raw.information).into(it) }

        binding.imgInformation?.setOnClickListener {

            GuideView.Builder(context).setTitle("Kosakata Baru")
                .setContentText(
                    "pendulum: bandul yang bergantung pada seutas tali"
                )
                .setTargetView(it)
                .setDismissType(DismissType.anywhere)
                .build().show()

            val drawable = (it as ImageView).drawable
            if (drawable is Animatable) {
                (drawable as Animatable).stop()
            }

        }

    }

}