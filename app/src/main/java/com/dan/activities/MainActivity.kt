package com.dan.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnNext)
        val toast = findViewById<Button>(R.id.btnToast)
        button.text = getString(R.string.nextScreen2)

        button.setOnClickListener(this)
        toast.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if(view != null){
            when(view.id){
                R.id.btnNext -> {
                    startActivity(Intent(this,Screen2::class.java))
                }
                R.id.btnToast -> {
                    Toast.makeText(this,"Click Main Activity",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}