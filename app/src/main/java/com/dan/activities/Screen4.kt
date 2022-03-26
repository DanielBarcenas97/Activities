package com.dan.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dan.activities.databinding.ActivityScreen4Binding

class Screen4 : AppCompatActivity() {

    private lateinit var binding: ActivityScreen4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScreen4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.extras?.let { bundle ->
            binding.AgeGrogu.text = "Tu edad en años Grogu es " + bundle.getInt("age").toString()
        }

        binding.btnFinish.setOnClickListener {
            finish()
        }

        binding.btnClearTop.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

    }
}