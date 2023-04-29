package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme3 : AppCompatActivity() {
    lateinit var bu:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        bu=findViewById(R.id.button3)
        bu.setOnClickListener {
            val intent = Intent(this, meme4::class.java)
            startActivity(intent)
        }
    }
}