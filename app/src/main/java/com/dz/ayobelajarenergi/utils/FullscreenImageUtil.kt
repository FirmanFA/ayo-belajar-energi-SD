package com.dz.ayobelajarenergi.utils


import android.content.Context
import androidx.annotation.DrawableRes

private var fullscreenImageDialog: FullscreenImageDialog? = null

fun showFullscreenImageDialog(context: Context?, @DrawableRes image: Int, onCancel:()->Unit) {
    hideFullscreenImageDialog()
    if (context != null) {
        try {
            // Initialize the class
            fullscreenImageDialog = FullscreenImageDialog(context, image, onCancel)
            //setting dialog properties
            fullscreenImageDialog?.show()

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

fun hideFullscreenImageDialog() {
    //dismissing the dialog
    if (fullscreenImageDialog != null && fullscreenImageDialog?.isShowing!!) {
        fullscreenImageDialog = try {
            fullscreenImageDialog?.dismiss()
            null
        } catch (e: Exception) {
            null
        }
    }
}