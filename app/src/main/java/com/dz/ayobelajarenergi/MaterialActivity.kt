package com.dz.ayobelajarenergi

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Pair
import android.view.MotionEvent
import android.view.View
import android.view.WindowInsets
import android.widget.LinearLayout
import android.widget.TextView
import com.dz.ayobelajarenergi.databinding.ActivityMaterialBinding
import com.dz.ayobelajarenergi.material1.Material1Activity
import com.dz.ayobelajarenergi.material2.Material2Activity
import com.dz.ayobelajarenergi.material3.Material3Activity

class MaterialActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMaterialBinding

    private val clickMediaPlayer: MediaPlayer by lazy {
        MediaPlayer.create(this, R.raw.click_sound)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMaterialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMaterial1?.setOnClickListener {
            val intent = Intent(this, Material1Activity::class.java)

            val option = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair(binding.btnMaterial1, "btnMaterial")
            )
            clickMediaPlayer.start()

            startActivity(intent, option.toBundle())
        }

        binding.btnMaterial1?.setOnTouchListener { view, motionEvent ->
            view.animateButton(motionEvent)
            true
        }

        binding.btnMaterial2?.setOnClickListener {
            val intent = Intent(this, Material2Activity::class.java)

            val option = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair(binding.btnMaterial2, "btnMaterial2")
            )
            clickMediaPlayer.start()

            startActivity(intent, option.toBundle())
        }

        binding.btnMaterial2?.setOnTouchListener { view, motionEvent ->
            view.animateButton(motionEvent)
            true
        }

        binding.btnMaterial3?.setOnClickListener {
            val intent = Intent(this, Material3Activity::class.java)

            val option = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair(binding.btnMaterial3, "btnMaterial3")
            )
            clickMediaPlayer.start()

            startActivity(intent, option.toBundle())
        }

        binding.btnMaterial3?.setOnTouchListener { view, motionEvent ->
            view.animateButton(motionEvent)
            true
        }

        binding.btnBack?.setOnClickListener {
            onBackPressed()
            clickMediaPlayer.start()
        }

//        binding.btnBack?.setOnTouchListener { view, motionEvent ->
//            view.animateButton(motionEvent)
//            true
//        }


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