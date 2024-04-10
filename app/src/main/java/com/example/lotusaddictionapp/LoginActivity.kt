package com.example.lotusaddictionapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.lotusaddictionapp.R.layout.login

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(login)
    }

    fun registerClickListener(view: View?){
        println("Register clicked")
    }
}
