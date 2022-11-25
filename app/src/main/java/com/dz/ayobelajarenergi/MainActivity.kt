package com.dz.ayobelajarenergi

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Intent
import android.graphics.Rect
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.util.Pair
import android.view.MotionEvent
import android.view.View
import android.view.WindowInsets
import android.widget.Toast
import com.dz.ayobelajarenergi.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val clickMediaPlayer = MediaPlayer.create(this, R.raw.click_sound)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMaterial?.setOnClickListener {
//            it.animateButton()

            val intent = Intent(this, MaterialActivity::class.java)

            val option = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair(binding.btnMaterial, "btnMaterial"),
                Pair(binding.btnQuiz, "btnQuiz")
            )

            startActivity(intent, option.toBundle())

            clickMediaPlayer.start()
        }

        binding.btnQuiz?.setOnClickListener {
            clickMediaPlayer.start()

            val intent = Intent(this, VideoActivity::class.java)

            val option = ActivityOptions.makeSceneTransitionAnimation(
                this,
                android.util.Pair(binding.btnQuiz, "openVideo")
            )

//            startActivity(intent, option.toBundle())
            startActivity(intent)
        }

        binding.btnMaterial?.setOnTouchListener { view, motionEvent ->
            view.animateButton(motionEvent)
            true
        }

        binding.btnQuiz?.setOnTouchListener { view, motionEvent ->
            view.animateButton(motionEvent)
            true
        }

    }

    override fun onResume() {
        super.onResume()

        if (Build.VERSION.SDK_INT >= 30) {
            binding.fullscreenContent?.windowInsetsController?.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
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