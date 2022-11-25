package com.dz.ayobelajarenergi.material2

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import com.dz.ayobelajarenergi.databinding.ActivityMaterial2Binding

class Material2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMaterial2Binding

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMaterial2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack?.setOnClickListener {
//            val currentItem = binding.vpFirstMaterial?.currentItem?:0
//            if (currentItem != 0){
//                binding.vpFirstMaterial?.currentItem = currentItem-1
//            }else{
//                onBackPressed()
//            }
        }

        binding.btnContinue?.setOnClickListener {
//            val currentItem = binding.vpFirstMaterial?.currentItem?:0
//            if (currentItem != vpAdapter.itemCount){
//                binding.vpFirstMaterial?.currentItem = currentItem+1
//            }else{
//                //move to materi 2
//            }
        }

    }

    override fun onResume() {
        super.onResume()

        if (Build.VERSION.SDK_INT >= 30) {
            binding.fullscreenContent.windowInsetsController?.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
        } else {

            window.decorView.apply {
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