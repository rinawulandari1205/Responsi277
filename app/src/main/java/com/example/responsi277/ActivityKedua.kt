package com.example.responsi277

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kedua.*
import kotlinx.android.synthetic.main.activity_main.*

class ActivityKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_kedua)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        var intent = intent
        val Usename = intent.getStringExtra("Username")
        val Password = intent.getStringExtra("Password")


        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "Username : "+Usename+"\nPassword: "+Password

        val ket = findViewById<TextView>(R.id.keterangan)





    }
}