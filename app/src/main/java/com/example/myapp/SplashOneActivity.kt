package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashOneActivity: AppCompatActivity() {

    private lateinit var textViewNext: TextView
    private  lateinit var textViewSkip: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash1)

        textViewNext = findViewById(R.id.btnnext)
        textViewSkip = findViewById(R.id.btnskip)

        textViewNext.setOnClickListener() {
            onClick(it)
        }

        textViewSkip.setOnClickListener() {
            val intent = Intent(this@SplashOneActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
    private fun onClick(view: View?) {
        val intent = Intent(this@SplashOneActivity, SplashTwoActivity::class.java)
        startActivity(intent)
    }
}