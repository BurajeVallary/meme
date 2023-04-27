package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class threeActivity2 : AppCompatActivity() {
    lateinit var btnfour:Button
    lateinit var btnthree:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three2)
        btnfour = this.findViewById(R.id.btnfour)
        btnthree = this.findViewById(R.id.btnthree)
        btnthree.setOnClickListener {
            val intent =Intent (this,twoActivity2::class.java)
            startActivity(intent)
        }
        btnfour.setOnClickListener {
            val intent = Intent(this,fourActivity2::class.java)
            startActivity(intent)
        }
    }
}
//class threeActivity2 : AppCompatActivity() {
//    lateinit var btnfour:Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_three2)
//        btnfour = this.findViewById(R.id.btnfour)
//        btnfour.setOnClickListener {
//            val intent = Intent(this,fourActivity2::class.java)
//            startActivity(intent)
//        }
//    }
//}