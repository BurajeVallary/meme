package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fourActivity2 : AppCompatActivity() {
    lateinit var btnsho4:Button
    lateinit var  btnshoes:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four2)
        btnsho4 = this.findViewById(R.id.btnsho4)
        btnshoes =this.findViewById(R.id.btnshoes)
        btnshoes .setOnClickListener {
            val intent =Intent(this,threeActivity2::class.java)
            startActivity(intent)
        }
        btnsho4.setOnClickListener {
            val intent =Intent(this,fiveActivity2::class.java)
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