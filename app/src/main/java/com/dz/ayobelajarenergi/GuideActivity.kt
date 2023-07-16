package com.dz.ayobelajarenergi

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Spannable
import android.text.SpannableString
import android.text.style.DynamicDrawableSpan
import android.text.style.ImageSpan
import android.view.MotionEvent
import android.view.View
import android.view.WindowInsets
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.databinding.ActivityGuideBinding


class GuideActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGuideBinding

    private val clickMediaPlayer: MediaPlayer by lazy {
        MediaPlayer.create(this, R.raw.click_sound)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuideBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val spannableGuideString = SpannableString("Petunjuk penggunaan ikon\n" +
//                " \tdigunakan untuk kembali ke halaman sebelumnya\n" +
//                " \tdigunakan untuk menuju ke halaman berikutnya\n" +
//                " \tdigunakan untuk kembali ke menu materi utama\n" +
//                " \tdigunakan untuk melihat kosakata baru");
//
//
//        spannableGuideString.setSpan(ImageSpan(this, R.drawable.arrow, DynamicDrawableSpan.ALIGN_BASELINE),9,10,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        binding.tvGuide?.text = spannableGuideString

        binding.imgInfo?.let { Glide.with(this).asGif().load(R.raw.information).into(it) }

        binding.btnContinue.setOnClickListener {
            clickMediaPlayer.start()
            finish()
        }

    }

    override fun onResume() {
        super.onResume()
        if (Build.VERSION.SDK_INT >= 30) {
            binding.fullscreenContent.windowInsetsController
                ?.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
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