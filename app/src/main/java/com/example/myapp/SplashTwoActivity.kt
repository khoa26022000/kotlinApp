package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashTwoActivity: AppCompatActivity() {
    private lateinit var textViewNext: TextView
    private  lateinit var textViewSkip: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash2)

        textViewNext = findViewById(R.id.btnnext)
        textViewSkip = findViewById(R.id.btnskip)

        textViewNext.setOnClickListener() {
            val intent = Intent(this@SplashTwoActivity, SplashThreeActivity::class.java)
            startActivity(intent)
        }

        textViewSkip.setOnClickListener() {
            val intent = Intent(this@SplashTwoActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}