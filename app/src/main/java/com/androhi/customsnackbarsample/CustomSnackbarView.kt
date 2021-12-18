package com.androhi.customsnackbarsample

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.androhi.customsnackbarsample.databinding.ItemCustomSnackbarBinding
import com.google.android.material.snackbar.ContentViewCallback

class CustomSnackbarView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet,
    defaultStyle: Int = 0,
): ConstraintLayout(context, attributeSet, defaultStyle), ContentViewCallback {

    private val binding = ItemCustomSnackbarBinding.inflate(LayoutInflater.from(context), this, true)

    override fun animateContentIn(delay: Int, duration: Int) {
        binding.icon.run {
            alpha = 0f
            animate().alpha(1f).setDuration(duration.toLong()).setStartDelay(delay.toLong()).start()
        }
        binding.message.run {
            alpha = 0f
            animate().alpha(1f).setDuration(duration.toLong()).setStartDelay(delay.toLong()).start()
        }
    }

    override fun animateContentOut(delay: Int, duration: Int) {
        binding.icon.run {
            alpha = 1f
            animate().alpha(0f).setDuration(duration.toLong()).setStartDelay(delay.toLong()).start()
        }
        binding.message.run {
            alpha = 1f
            animate().alpha(0f).setDuration(duration.toLong()).setStartDelay(delay.toLong()).start()
        }
    }
}