package com.dan.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.dan.activities.databinding.ActivityScreen3Binding

class Screen3 : AppCompatActivity() {

    private lateinit var binding: ActivityScreen3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreen3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide
            .with(this)
            .load("https://upload.wikimedia.org/wikipedia/en/a/a0/Grogu_%28Star_Wars%29.jpg")
            .centerCrop()
            .placeholder(R.drawable.grogu3)
            .into(binding.imageView)
    }

    fun clickFeo(view: View) {
        when(view.id){
            R.id.btnNext -> {
                val age = binding.etAge.text
                if(age.isNotEmpty()){
                    val intent = Intent(this,Screen4::class.java)
                    intent.putExtra("age",age.toString().toInt() * 50)
                    startActivity(intent)
                }else{
                    Toast.makeText(this,"Introduce tu edad", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}