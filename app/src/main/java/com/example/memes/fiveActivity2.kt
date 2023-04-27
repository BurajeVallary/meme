package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fiveActivity2 : AppCompatActivity() {
    lateinit var btnlast:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five2)
        btnlast = this.findViewById(R.id.btnlast)
        btnlast.setOnClickListener {
            val intent = Intent(this,fourActivity2::class.java)
            startActivity(intent)
        }
    }
}
