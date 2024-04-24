package com.example.lotusaddictionapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        val registerBtn = findViewById<Button>(R.id.registerButton)
        registerBtn.setOnClickListener{
            println("Register clicked in LoginActivity")
            val intent = Intent(this, RegisterActivity::class.java)//I've never used kotlin much, but can I still just use class.java here without any problems?
            startActivity(intent) //start up the registration activity
        }
    }
}