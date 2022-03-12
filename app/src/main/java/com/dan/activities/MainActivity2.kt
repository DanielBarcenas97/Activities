package com.dan.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dan.activities.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.text = getString(R.string.btnNext)

        binding.btnNext.setOnClickListener {
            Toast.makeText(this,getString(R.string.toastClick), Toast.LENGTH_LONG).show()
        }

    }





}