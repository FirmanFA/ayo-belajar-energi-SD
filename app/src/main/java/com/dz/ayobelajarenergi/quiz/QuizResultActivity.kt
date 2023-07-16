package com.dz.ayobelajarenergi.quiz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import com.dz.ayobelajarenergi.MainActivity
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.ActivityQuizResultBinding

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class QuizResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizResultBinding

    private val clickMediaPlayer: MediaPlayer by lazy {
        MediaPlayer.create(this, R.raw.click_sound)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rightAnswerCount = intent.getIntExtra("rightAnswerCount",0)

        binding.textView13.text = "$rightAnswerCount/10"
        val messageText = if (rightAnswerCount == 10){"pertanyaan terjawab, nilai kamu sempurna!"}else{
            "$rightAnswerCount pertanyaan terjawab dengan benar! kamu bisa tingkatkan lagi pemahamanmu agar mendapat nilai yang lebih baik!"
        }
        binding.textView14.text = messageText

        binding.btnContinue.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
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