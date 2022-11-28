package com.dz.ayobelajarenergi.material2.content

import android.graphics.drawable.Animatable
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.*
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentSecondMaterial9Binding
import com.dz.ayobelajarenergi.material2.Material2Activity
import com.dz.ayobelajarenergi.utils.showFullscreenImageDialog
import smartdevelop.ir.eram.showcaseviewlib.GuideView
import smartdevelop.ir.eram.showcaseviewlib.config.DismissType

class SecondMaterial9Fragment :
    BaseFragment<FragmentSecondMaterial9Binding>(FragmentSecondMaterial9Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.imgWaterTurbine?.setOnClickListener {

            showFullscreenImageDialog(context, R.drawable.water_turbine) {


                val activity = activity as Material2Activity
                if (Build.VERSION.SDK_INT >= 30) {
                    activity.binding.fullscreenContent.windowInsetsController?.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
                } else {
                    activity.window.decorView.apply {
                        systemUiVisibility = View.SYSTEM_UI_FLAG_LOW_PROFILE or
                                View.SYSTEM_UI_FLAG_FULLSCREEN or
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    }
                }
            }
        }

        binding.imgInformation?.let { Glide.with(this).asGif().load(R.raw.information).into(it) }

        binding.imgInformation?.setOnClickListener {

            GuideView.Builder(context).setTitle("Kosakata Baru")
                .setContentText(
                    "generator: pembangkit tenaga\n" +
                            "turbin: mesin atau motor yang roda penggeraknya berbentuk baling-baling"
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