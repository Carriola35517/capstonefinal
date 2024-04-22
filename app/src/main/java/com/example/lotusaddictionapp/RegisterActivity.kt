package com.example.lotusaddictionapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)


        val continueBtn = findViewById<Button>(R.id.buttonContinue) //not to be confused with continueButton from the payment activity
        continueBtn.setOnClickListener{
            println("Continue clicked in RegisterActivity")
            /*
            REGISTER LOGIC STILL NEEDED
            What we need here is the things to handle the register logic, could maybe use a json file for this.
            Or a database honestly, whatever we are more comfortable using probably
            For now I'm just going to have it redirect to the welcome page probably
            */
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent) //start up the welcome activity
        }

    }

}
