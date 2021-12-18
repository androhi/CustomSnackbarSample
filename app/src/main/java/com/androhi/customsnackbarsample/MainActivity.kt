package com.androhi.customsnackbarsample

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.androhi.customsnackbarsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showButton.setOnClickListener {
            (binding.root.rootView as? ViewGroup)?.let {
                CustomSnackbar.make(it).show()
            }
        }
    }
}