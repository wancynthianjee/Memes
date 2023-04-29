package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme2 : AppCompatActivity() {
    lateinit var b: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        b = findViewById(R.id.button2)
        b.setOnClickListener {
            val intent = Intent(this, meme3::class.java)
            startActivity(intent)
        }
    }
}