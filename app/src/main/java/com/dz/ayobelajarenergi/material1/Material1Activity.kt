package com.dz.ayobelajarenergi.material1

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowInsets
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.ActivityMaterial1Binding
import com.dz.ayobelajarenergi.material2.Material2Activity

class Material1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMaterial1Binding
    private val vpAdapter by lazy {
        FirstMaterialAdapter(supportFragmentManager, lifecycle)
    }
    private val clickMediaPlayer: MediaPlayer by lazy {
        MediaPlayer.create(this, R.raw.click_sound)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMaterial1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vpFirstMaterial?.apply {
            adapter = vpAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            (getChildAt(0) as RecyclerView).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        }

        binding.btnBack?.setOnClickListener {
            val currentItem = binding.vpFirstMaterial?.currentItem?:0
            if (currentItem != 0){
                binding.vpFirstMaterial?.currentItem = currentItem-1
            }else{
                onBackPressed()
            }
            clickMediaPlayer.start()
        }

        binding.btnContinue?.setOnClickListener {
            val currentItem = binding.vpFirstMaterial?.currentItem?:0
            if (currentItem != vpAdapter.itemCount-1){
                binding.vpFirstMaterial?.currentItem = currentItem+1
            }else{
                //move to materi 2
                val intent = Intent(this, Material2Activity::class.java)
                startActivity(intent)
                finish()
            }
            clickMediaPlayer.start()
        }

        binding.btnHome?.setOnClickListener {
            onBackPressed()
            clickMediaPlayer.start()
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