package com.dz.ayobelajarenergi.material1.content

import android.graphics.drawable.Animatable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.dz.ayobelajarenergi.R
import com.dz.ayobelajarenergi.databinding.FragmentFirstMaterial1Binding
import smartdevelop.ir.eram.showcaseviewlib.GuideView
import smartdevelop.ir.eram.showcaseviewlib.config.DismissType


class FirstMaterial1Fragment : Fragment() {

    private lateinit var binding: FragmentFirstMaterial1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstMaterial1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.imgInformation?.let { Glide.with(this).asGif().load(R.raw.information).into(it) }

        binding.imgInformation?.setOnClickListener { view1 ->
            GuideView.Builder(context).setTitle("Kosakata Baru")
                .setContentText(
                    "transformasi: perubahan, bisa perubahan bentuk, fungsi, sifat, dan \n" +
                            "sebagainya"
                )
                .setTargetView(view1)
                .setDismissType(DismissType.anywhere)
                .build().show()

            val drawable = binding.imgInformation!!.drawable
            if (drawable is Animatable) {
                (drawable as Animatable).stop()
            }

//            binding.imgInformation?.let {
//                Glide.with(this).asBitmap().load(R.raw.information).into(it)
//            }


        }


    }

//    override fun onResume() {
//        super.onResume()
//        val drawable = binding.imgInformation!!.drawable
//        if (drawable is Animatable) {
//            (drawable as Animatable).start()
//        }
//    }

}