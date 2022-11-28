package com.dz.ayobelajarenergi.material2.content

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentSecondMaterial2Binding


class SecondMaterial2Fragment :
    BaseFragment<FragmentSecondMaterial2Binding>(FragmentSecondMaterial2Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val materialString = "Umumnya sumber energi yang ada di alam tersimpan dalam " +
                "berbagai macam benda. Energi yang tersimpan pada suatu benda " +
                "disebut sebagai energi potensial. Artinya benda ini memiliki potensi " +
                "atau kemampuan untuk menjadi sumber energi. Namun, tentu saja " +
                "membutuhkan transformasi energi untuk memanfaatkannya."

        val materialText = SpannableString(materialString)
        materialText.setSpan(
            StyleSpan(Typeface.BOLD),
            76, // start
            149, // end
            Spannable.SPAN_EXCLUSIVE_INCLUSIVE
        )
        binding.tvMaterial?.text = materialText

    }


}