package com.example.lotusaddictionapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar)

        val logoutBtn = findViewById<Button>(R.id.buttonLogout)
        logoutBtn.setOnClickListener{
            println("Logout button clicked in CalendarActivity")

            //implement logout logic here

            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent) //start up the welcome activity
        }
    }
}