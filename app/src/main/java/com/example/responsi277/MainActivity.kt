package com.example.responsi277

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<EditText>(R.id.inuser)
        val password = findViewById<EditText>(R.id.inpass)

        val button = findViewById<Button>(R.id.btn_login)

        .setOnClickListener {
            var username = username.text.toString()
            var password = password.text.toString()


            intent = Intent(this@MainActivity, ActivityKedua::class.java)
            intent.putExtra("username", username)
            intent.putExtra("Password", password)


            if (username.equals("rina")&&password.equals("277")){
                Toast.makeText(getApplicationContext(),"Username dan Password benar Anda berhasil Login",Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(getApplicationContext(),"Username dan Pssword tidak sesuai Anda gagal Login",Toast.LENGTH_SHORT).show();
            }

            startActivity(intent)
        }
    }
}