package com.dz.ayobelajarenergi

import android.graphics.Rect
import android.view.MotionEvent
import android.view.View
import kotlin.math.roundToInt

fun View.animateButton(motionEvent: MotionEvent) {
    when (motionEvent.action) {
        MotionEvent.ACTION_UP -> {
            this.animate().apply {
                scaleX(1f)
                scaleY(1f)
                duration = 50
            }

            val visibleRect = Rect()
            this.getGlobalVisibleRect(visibleRect)

            val x = motionEvent.rawX.roundToInt()
            val y = motionEvent.rawY.roundToInt()

            if (visibleRect.contains(x, y)) {
                this.performClick()
            }


        }
        MotionEvent.ACTION_DOWN -> {
            this.animate().apply {
                this.scaleX(1.1f)
                scaleY(1.1f)
                duration = 50
            }
        }
    }
}