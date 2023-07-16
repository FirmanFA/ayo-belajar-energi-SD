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
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.databinding.ActivityMainBinding
import com.dz.ayobelajarenergi.quiz.QuizActivity
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val clickMediaPlayer = MediaPlayer.create(this, R.raw.click_sound)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.imageView7?.let { Glide.with(this).asGif().load(R.raw.question_mark).into(it) }

        binding.imageView7?.setOnClickListener {
            // TODO - go to guide page
            val intent = Intent(this, GuideActivity::class.java)
            startActivity(intent)
        }

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

            val intent = Intent(this, QuizActivity::class.java)

            val option = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair(binding.btnQuiz, "btnQuiz")
            )

            startActivity(intent, option.toBundle())

            clickMediaPlayer.start()
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