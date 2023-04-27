package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class twoActivity2 : AppCompatActivity() {
    lateinit var btncattwo:Button
    lateinit var btncatone:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two2)
        btncattwo = this.findViewById(R.id.btncattwo)
        btncatone =this.findViewById(R.id.btncatone)
        btncatone .setOnClickListener {
            val intent =Intent(this,fiveActivity2::class.java)
            startActivity(intent)
        }
        btncattwo.setOnClickListener {
           val intent = Intent(this,threeActivity2::class.java)
            startActivity(intent)
        }
    }
}

