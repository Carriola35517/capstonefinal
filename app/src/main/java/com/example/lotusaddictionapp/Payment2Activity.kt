package com.example.lotusaddictionapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Payment2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment2)

        //COMPLETE BUTTON
        val completeBtn = findViewById<Button>(R.id.completeButton)
        completeBtn.setOnClickListener {
            println("Coomplete clicked in Payment2Activity")

            /*
            LOGIC STILL NEEDS TO BE HANDLED HERE
            all of the logic to handle filling in all of the boxes and saving them
            to a json file/database should be done here probably.
            Could maybe be done seperately from the button, but I believe the button
            is the best trigger for this
             */

            val intent = Intent(this, Payment2Activity::class.java)
            startActivity(intent) //start up the welcome activity
        }
    }
}