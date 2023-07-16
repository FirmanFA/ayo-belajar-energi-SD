package com.dz.ayobelajarenergi.model

data class QuizQuestion(
    val id: Int,
    val question: String,
    val answers: Answer,
    val rightAnswer: AnswerChoice,
    val image: Int?
){
    data class Answer(
        val A: String,
        val B: String,
        val C: String,
        val D: String
    )
}

enum class AnswerChoice {
    A,
    B,
    C,
    D
}

