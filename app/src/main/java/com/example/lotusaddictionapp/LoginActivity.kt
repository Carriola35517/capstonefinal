package com.example.lotusaddictionapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        //REGISTER BUTTON
        val registerBtn = findViewById<Button>(R.id.registerButton)
        registerBtn.setOnClickListener{
            println("Register clicked in LoginActivity")
            val intent = Intent(this, RegisterActivity::class.java)//I've never used kotlin much, but can I still just use class.java here without any problems?
            startActivity(intent) //start up the registration activity
        }

        //LOGIN BUTTON
        val loginBtn = findViewById<Button>(R.id.loginButton)
        loginBtn.setOnClickListener{
            println("Login clicked in LoginActivity")
            /*
            LOGIN LOGIC STILL NEEDED
            What we need here is the things to handle the login logic, could maybe use a json file for this.
            Or a database honestly, whatever we are more comfortable using probably
            For now I'm just going to have it redirect to the welcome page probably
            */
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent) //start up the welcome activity
        }
    }


}
