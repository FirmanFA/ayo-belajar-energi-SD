package com.dz.ayobelajarenergi.utils

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.annotation.DrawableRes
import androidx.constraintlayout.widget.ConstraintLayout
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FullscreenImageDialogBinding

class FullscreenImageDialog(context: Context, @DrawableRes val image: Int, val onCancel:() -> Unit) :
    Dialog(context, android.R.style.Theme_NoTitleBar_Fullscreen) {


    lateinit var binding: FullscreenImageDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FullscreenImageDialogBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //setting layout
        window?.setLayout(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT
        )

        binding.imgSource.setImageResource(image)

        binding.imgSource.setOnClickListener {
            hideFullscreenImageDialog()
            onCancel.invoke()
        }

        //making background transparent
        window?.setBackgroundDrawableResource(R.color.white)

    }


}