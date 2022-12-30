package com.example.kidslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.Runnable

class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(object:Runnable{
            override fun run() {
               startActivity(Intent(this@Splash_Screen,MainActivity::class.java))
                finish()
            }

        },3000)

    }
}