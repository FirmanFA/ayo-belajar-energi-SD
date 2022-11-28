package com.dz.ayobelajarenergi.material2.content

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsets
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentSecondMaterial10Binding
import com.dz.ayobelajarenergi.material2.Material2Activity
import com.dz.ayobelajarenergi.utils.showFullscreenImageDialog

class SecondMaterial10Fragment :
    BaseFragment<FragmentSecondMaterial10Binding>(FragmentSecondMaterial10Binding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgCoalGenerator?.setOnClickListener {

            showFullscreenImageDialog(context, R.drawable.coal_generator) {

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


    }


}