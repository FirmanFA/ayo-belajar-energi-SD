package com.dz.ayobelajarenergi.utils

import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.model.AnswerChoice
import com.dz.ayobelajarenergi.model.QuizQuestion

val quizList = listOf(
    QuizQuestion(
        id = 1,
        question = "Perubahan energi yang terjadi pada gambar di atas adalah...",
        answers = QuizQuestion.Answer(
            A = "panas menjadi listrik",
            B = "listrik menjadi panas",
            C = "gerak menjadi panas",
            D = "listrik menjadi gerak"
        ),
        rightAnswer = AnswerChoice.B,
        image = R.drawable.iron
    ),
    QuizQuestion(
        id = 2,
        question = "Transformasi energi gerak menjadi panas ditujunkkan oleh nomor...",
        answers = QuizQuestion.Answer(
            A = "1 dan 2",
            B = "2 dan 3",
            C = "3 dan 4",
            D = "4 dan 5"
        ),
        rightAnswer = AnswerChoice.A,
        image = R.drawable.soal_1
    ),
    QuizQuestion(
        id = 3,
        question = "Urutan perubahan energi yang terjadi pada alat seperti pada gambar adalah...",
        answers = QuizQuestion.Answer(
            A = "energi listrik menjadi cahaya",
            B = "energi kimia menjadi cahaya",
            C = "energi kimia menjadi panas",
            D = "energi listrik menjadi panas"
        ),
        rightAnswer = AnswerChoice.C,
        image = R.drawable.soal_2
    ),
    QuizQuestion(
        id = 4,
        question = "Perhatikan beberapa benda berikut!" +
                "\n1. Penanak nasi." +
                "\n2. Blender." +
                "\n3. Kipas angin." +
                "\n4. Setrika." +
                "\nBenda yang merupakan perubahan energi listrik " +
                "menjadi panas ditunjukkan oleh nomor...",
        answers = QuizQuestion.Answer(
            A = "1 dan 2",
            B = "2 dan 4",
            C = "1 dan 4",
            D = "3 dan 2"
        ),
        rightAnswer = AnswerChoice.C,
        image = null
    ),
    QuizQuestion(
        id = 5,
        question = "Perubahan energi dan contoh benda yang benar ditunjukkan oleh angka dan huruf...",
        answers = QuizQuestion.Answer(
            A = "1c, 2b, 3a",
            B = "1a, 2b, 3c",
            C = "1b, 2a, 3c",
            D = "1b, 2c, 3a"
        ),
        rightAnswer = AnswerChoice.B,
        image = R.drawable.soal_3
    ),
    QuizQuestion(
        id = 6,
        question = "Pada hari minggu indah membantu ibu membuat kue. Untuk memasak kue tersebut indah menggunakan oven. Perubahan energi yang terjadi pada penggunaan oven adalah...",
        answers = QuizQuestion.Answer(
            A = "listrik menjadi kimia",
            B = "kimia menjadi panas",
            C = "panas menjadi gerak",
            D = "listrik menjadi panas"
        ),
        rightAnswer = AnswerChoice.D,
        image = null
    ),
    QuizQuestion(
        id = 7,
        question = "Energi alternatif ini dapat digunakan untuk pergerakan turbin yang memutar generator, generator ini dapat menghasilkan listrik, dan turbin biasanya terletak di tepi sungai. maka energi alternatif yang dimaksud adalah...",
        answers = QuizQuestion.Answer(
            A = "Matahari",
            B = "Panas bumi",
            C = "Air",
            D = "Angin"
        ),
        rightAnswer = AnswerChoice.C,
        image = null
    ),
    QuizQuestion(
        id = 8,
        question = "Berikut yang merupakan transformasi energi gerak menjadi energi panas ditunjukkan oleh gambar...",
        answers = QuizQuestion.Answer(
            A = "1",
            B = "2",
            C = "3",
            D = "4"
        ),
        rightAnswer = AnswerChoice.C,
        image = R.drawable.soal_4
    ),
    QuizQuestion(
        id = 9,
        question = "Andi sedang memainkan alat musik gitar di taman. Ibu dapat mendengar suara gitar dari dalam rumah. Suara gitar yang bergerak sampai ke telinga termasuk ke dalam energi...",
        answers = QuizQuestion.Answer(
            A = "kinetik",
            B = "potensial",
            C = "potensial kinetik",
            D = "gravitasi"
        ),
        rightAnswer = AnswerChoice.A,
        image = null
    ),
    QuizQuestion(
        id = 10,
        question = "Energi listrik dapat diubah menjadi bentuk energi lain. Kelompok alat yang mengubah energi listrik menjadi energi gerak adalah...",
        answers = QuizQuestion.Answer(
            A = "kipas angin, mesin cuci, dan bor listrik",
            B = "teko listrik, kompor listrik, dan dispenser",
            C = "radio, televisi, dan kipas angin",
            D = "pengering rambut, bor listrik, dan solder listrik"
        ),
        rightAnswer = AnswerChoice.A,
        image = null
    ),
    QuizQuestion(
        id = 11,
        question = "Pada baterai terdapat senyawa senyawa kimia. Kemudian baterai dipasang pada senter. Perubahan bentuk energi yang terjadi adalah...",
        answers = QuizQuestion.Answer(
            A = "energi listrik menjadi cahaya",
            B = "energi listrik menjadi gerak",
            C = "energi kimia menjadi listrik",
            D = "energi kimia menjadi gerak"
        ),
        rightAnswer = AnswerChoice.A,
        image = null
    ),
    QuizQuestion(
        id = 12,
        question = "Pada gambar terjadi proses pembuatan energi biogas yang berasal dari kotoran hewan, kemudian disimpan dalam tabung dan menghasilkan senyawa kimia. Perubahan bentuk energi yang terjadi adalah...",
        answers = QuizQuestion.Answer(
            A = "energi panas >> energi listrik >> energi kimia",
            B = "energi kimia >> energi gerak >> energi panas",
            C = "energi kimia >> energi panas >> energi listrik",
            D = "energi kimia >> energi panas >> energi gerak"
        ),
        rightAnswer = AnswerChoice.B,
        image = R.drawable.soal_6
    ),
    QuizQuestion(
        id = 13,
        question = "Perhatikan beberapa pernyataan berikut!\n1. Menggosok-gosokkan kedua telapak tangan.\n2. Menggosok-gosokkan pipi dengan kedua telapak tangan.\n3. Bertepuk tangan.\n4. Mengambil botol dengan kedua tangan.\nContoh perubahan dari energi gerak menjadi energi bunyi ditunjukkan oleh nomor...",
        answers = QuizQuestion.Answer(
            A = "1, 2, dan 3",
            B = "2 dan 3",
            C = "3",
            D = "3 dan 4"
        ),
        rightAnswer = AnswerChoice.C,
        image = null
    ),
    QuizQuestion(
        id = 14,
        question = "Saat rumah rudi mati listrik, ia menyalakan lilin di ruang tengah. Lilin yang dibakar tersebut merupakan perubahan energi... menjadi...",
        answers = QuizQuestion.Answer(
            A = "kimia, panas",
            B = "kimia, cahaya",
            C = "gerak, panas",
            D = "kimia, gerak"
        ),
        rightAnswer = AnswerChoice.B,
        image = null
    ),
    QuizQuestion(
        id = 15,
        question = "Benda di atas yang merupakan transformasi energi listrik menjadi panas ditunjukkan oleh nomor...",
        answers = QuizQuestion.Answer(
            A = "1",
            B = "2",
            C = "3",
            D = "4"
        ),
        rightAnswer = AnswerChoice.C,
        image = R.drawable.soal_5
    ),
)