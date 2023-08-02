package com.dz.ayobelajarenergi.quiz

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.MainActivity
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.ActivityQuizContainerBinding
import com.dz.ayobelajarenergi.model.AnswerChoice
import com.dz.ayobelajarenergi.model.QuizAnswer
import com.dz.ayobelajarenergi.utils.get10QuizQuestions
import com.google.android.material.button.MaterialButton

class QuizContainerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizContainerBinding
    private val quizList = get10QuizQuestions()
    private val answerList = ArrayList<QuizAnswer>()
    private var currentQuestionIndex = 0
    private var isAnswered = false
    private val clickMediaPlayer: MediaPlayer by lazy {
        MediaPlayer.create(this, R.raw.click_sound)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizContainerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateQuestion()

        binding.btnBack?.setOnClickListener {
            onBackPressed()
            clickMediaPlayer.start()
        }

        binding.btnHome?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
            finish()
            clickMediaPlayer.start()
        }

        binding.btnContinue?.setOnClickListener {
            if (isAnswered){
                if (currentQuestionIndex == 9) {
//                currentQuestionIndex = 0
                    // TODO - go to result page
//                    Toast.makeText(this, "$answerList", Toast.LENGTH_SHORT).show()

                    val rightAnswerCount = answerList.filter { it.isCorrect }.size

                    val intent = Intent(this, QuizResultActivity::class.java)
                    intent.putExtra("rightAnswerCount", rightAnswerCount)
                    startActivity(intent)
                } else {
                    currentQuestionIndex += 1
                }
                updateQuestion()
            }else{
                Toast.makeText(
                    this,
                    "Pilih salah satu jaawaban terlebih dahulu",
                    Toast.LENGTH_SHORT
                ).show()
            }
            clickMediaPlayer.start()
        }

        binding.btnAnswerA?.setOnClickListener {
            selectAnswer(AnswerChoice.A)
            clickMediaPlayer.start()
        }

        binding.btnAnswerB?.setOnClickListener {
            selectAnswer(AnswerChoice.B)
            clickMediaPlayer.start()
        }
        binding.btnAnswerC?.setOnClickListener {
            selectAnswer(AnswerChoice.C)
            clickMediaPlayer.start()
        }
        binding.btnAnswerD?.setOnClickListener {
            selectAnswer(AnswerChoice.D)
            clickMediaPlayer.start()
        }

    }

    private fun selectAnswer(selectedAnswerChoice: AnswerChoice) {
        when (selectedAnswerChoice) {
            AnswerChoice.A -> {
                binding.btnAnswerA?.let { selectButton(it) }
                unSelectButton(binding.btnAnswerB, binding.btnAnswerC, binding.btnAnswerD)
            }
            AnswerChoice.B -> {
                binding.btnAnswerB?.let { selectButton(it) }
                unSelectButton(binding.btnAnswerA, binding.btnAnswerC, binding.btnAnswerD)
            }
            AnswerChoice.C -> {
                binding.btnAnswerC?.let { selectButton(it) }
                unSelectButton(binding.btnAnswerA, binding.btnAnswerB, binding.btnAnswerD)
            }
            AnswerChoice.D -> {
                binding.btnAnswerD?.let { selectButton(it) }
                unSelectButton(binding.btnAnswerA, binding.btnAnswerC, binding.btnAnswerB)

            }
        }
        val isCorrect = quizList[currentQuestionIndex].rightAnswer == selectedAnswerChoice
        answerList.add(
            QuizAnswer(
                quizList[currentQuestionIndex].id,
                selectedAnswerChoice,
                isCorrect
            )
        )
        isAnswered = true
    }

    private fun selectButton(button: MaterialButton) {
        button.strokeWidth = 5
        button.strokeColor = ColorStateList.valueOf(resources.getColor(R.color.white, this.theme))
    }

    private fun unSelectButton(vararg button: MaterialButton?) {
        button.forEach {
            it?.strokeWidth = 0
        }
    }

//    private fun darkenButton(button: Button) {
//        val buttonColor = button.background as ColorDrawable
//        val darkerColor = ColorUtils
//            .blendARGB(buttonColor.color, Color.BLACK, 0.5f)
//        button.setBackgroundColor(darkerColor)
//    }
//
//    private fun whitenButton(vararg button: Button?) {
//        button.forEach {
//            val buttonColor = it?.background as ColorDrawable
//            val lighterColor = ColorUtils
//                .blendARGB(buttonColor.color, Color.WHITE, 0.5f)
//            it.setBackgroundColor(lighterColor)
//        }
//    }

    private fun updateQuestion() {
        val currentQuestion = quizList[currentQuestionIndex]

        if (currentQuestion.image == null) {
            binding.imgQuestionImage?.visibility = View.GONE
            val textParam = binding.tvQuestion?.layoutParams as ConstraintLayout.LayoutParams
            textParam.topToTop = binding.imgQuestionContainer?.id ?: 0
            textParam.topMargin = 24
        } else {

            binding.imgQuestionImage?.visibility = View.VISIBLE
            val textParam = binding.tvQuestion?.layoutParams as ConstraintLayout.LayoutParams
            textParam.topToTop = ConstraintLayout.LayoutParams.UNSET
            textParam.topToBottom = binding.imgQuestionImage?.id ?: 0
            textParam.topMargin = 8

            binding.imgQuestionImage?.setImageResource(currentQuestion.image)

//            if (currentQuestion.id == 6){
//
//                binding.imgQuestionImage?.visibility = View.VISIBLE
//                val textParam = binding.tvQuestion?.layoutParams as ConstraintLayout.LayoutParams
//                textParam.topToTop = ConstraintLayout.LayoutParams.UNSET
//                textParam.topToBottom = binding.imgQuestionImage?.id ?: 0
//                textParam.topMargin = 8
//
//                binding.imgQuestionImage?.let { Glide.with(this).asGif().load(currentQuestion.image).into(it) }
//
//            }else{
//                binding.imgQuestionImage?.visibility = View.VISIBLE
//                val textParam = binding.tvQuestion?.layoutParams as ConstraintLayout.LayoutParams
//                textParam.topToTop = ConstraintLayout.LayoutParams.UNSET
//                textParam.topToBottom = binding.imgQuestionImage?.id ?: 0
//                textParam.topMargin = 8
//
//                binding.imgQuestionImage?.setImageResource(currentQuestion.image)
//            }

        }

        binding.tvQuestion?.text = currentQuestion.question
        binding.btnAnswerA?.text = "A. ${currentQuestion.answers.A}"
        binding.btnAnswerB?.text = "B. ${currentQuestion.answers.B}"
        binding.btnAnswerC?.text = "C. ${currentQuestion.answers.C}"
        binding.btnAnswerD?.text = "D. ${currentQuestion.answers.D}"
        unSelectButton(binding.btnAnswerB, binding.btnAnswerC, binding.btnAnswerD, binding.btnAnswerA)
        isAnswered = false

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