package com.dan.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnNext)

        button.text = getString(R.string.btnNext)

        button.setOnClickListener {
            Toast.makeText(this,getString(R.string.toastClick),Toast.LENGTH_LONG).show()
        }
    }
}