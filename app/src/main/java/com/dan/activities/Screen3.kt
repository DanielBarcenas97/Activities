package com.dan.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Screen3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
    }

    fun clickFeo(view: View) {
        when(view.id){
            R.id.btnNext -> {
                startActivity(Intent(this,Screen4::class.java))
            }
        }
    }
}