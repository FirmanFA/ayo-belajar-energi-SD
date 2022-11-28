package com.dz.ayobelajarenergi.material2.content

import android.graphics.drawable.Animatable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentSecondMaterial8Binding
import smartdevelop.ir.eram.showcaseviewlib.GuideView
import smartdevelop.ir.eram.showcaseviewlib.config.DismissType

class SecondMaterial8Fragment :
    BaseFragment<FragmentSecondMaterial8Binding>(FragmentSecondMaterial8Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgInformation?.let { Glide.with(this).asGif().load(R.raw.information).into(it) }

        binding.imgInformation?.setOnClickListener {

            GuideView.Builder(context).setTitle("Kosakata Baru")
                .setContentText(
                    "fosil: sisa tulang belulang binatang atau tumbuhan zaman purba yang" +
                            "telah membatu dan tertanam di bawah lapisan tanah"
                )
                .setTargetView(it)
                .setDismissType(DismissType.anywhere)
                .build().show()

            val drawable = binding.imgInformation!!.drawable
            if (drawable is Animatable) {
                (drawable as Animatable).stop()
            }

        }

    }


}