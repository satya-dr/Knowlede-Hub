package com.example.knoledgehub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val buttonSecondPage=findViewById<Button>(R.id.button1)
         buttonSecondPage.setOnClickListener {
             intent= Intent(applicationContext, SecondPage::class.java)
             startActivity(intent)
         }
    }
}