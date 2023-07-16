package com.dz.ayobelajarenergi.model

data class QuizAnswer(
    val quizId: Int,
    val answer: AnswerChoice,
    val isCorrect: Boolean
)