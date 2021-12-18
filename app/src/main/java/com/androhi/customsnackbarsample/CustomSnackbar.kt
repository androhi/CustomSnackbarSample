package com.androhi.customsnackbarsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class CustomSnackbar(
    parent: ViewGroup,
    content: CustomSnackbarView
) : BaseTransientBottomBar<CustomSnackbar>(parent, content, content) {

    init {
        getView().setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.transparent))
        getView().setPadding(0, 0, 0, 0)
    }

    companion object {
        fun make(parent: ViewGroup): CustomSnackbar {
            val content = LayoutInflater.from(parent.context).inflate(
                R.layout.view_custom_snackbar,
                parent,
                false
            ) as CustomSnackbarView
            return CustomSnackbar(parent, content).setDuration(Snackbar.LENGTH_SHORT)
        }
    }
}