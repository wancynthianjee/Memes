package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme4 : AppCompatActivity() {
     lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        btn=findViewById(R.id.button3)
        btn.setOnClickListener {
            val intent = Intent(this, meme5::class.java)
            startActivity(intent)
        }
    }
}