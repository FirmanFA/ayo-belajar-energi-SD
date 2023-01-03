package com.dz.ayobelajarenergi.material3.content

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dz.ayobelajarenergi.BaseFragment
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentThirdMaterial1Binding

class ThirdMaterial1Fragment :
    BaseFragment<FragmentThirdMaterial1Binding>(FragmentThirdMaterial1Binding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val materialString = "Kita bisa membagi bentuk energi menjadi dua jenis, yaitu energi " +
                "potensial dan energi kinetik. Apa itu energi kinetik? Energi kinetik " +
                "adalah energi yang disebabkan oleh gerakan. Semua yang bergerak " +
                "artinya memiliki energi kinetik. Lalu, apakah benar cahaya bergerak? " +
                "Apa saja yang termasuk energi kinetik?"

        val materialText = SpannableString(materialString)
        materialText.setSpan(
            StyleSpan(Typeface.BOLD),
            118, // start
            176, // end
            Spannable.SPAN_EXCLUSIVE_INCLUSIVE
        )
        binding.tvMaterial?.text = materialText


    }


}