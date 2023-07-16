package com.dz.ayobelajarenergi.utils

import com.dz.ayobelajarenergi.model.QuizQuestion

fun get10QuizQuestions():List<QuizQuestion>{
    return quizList.asSequence().shuffled().take(10).toList()
}