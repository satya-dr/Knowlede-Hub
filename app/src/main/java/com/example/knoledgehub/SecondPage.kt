package com.example.knoledgehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_page)
       val buttonWebDev=findViewById<CardView>(R.id.WebDev)
        val buttonAndAppDev=findViewById<CardView>(R.id.AppDev)
        val buttonIosAppDev=findViewById<CardView>(R.id.IosDev)
        val buttonMl=findViewById<CardView>(R.id.ML)
        val buttonBlockChain=findViewById<CardView>(R.id.BlockChain)
        val buttonDsa=findViewById<CardView>(R.id.Dsa)
        val buttonContact=findViewById<Button>(R.id.contactBtn)

        buttonWebDev.setOnClickListener {
            intent= Intent(applicationContext, WebDevAct::class.java)
            startActivity(intent)
        }

        buttonAndAppDev.setOnClickListener {
            intent= Intent(applicationContext, AndroidAppDev::class.java)
            startActivity(intent)
        }
        buttonIosAppDev.setOnClickListener {
           intent= Intent(applicationContext, IosAppDev::class.java)
            startActivity(intent)
        }
        buttonMl.setOnClickListener {
          intent= Intent(applicationContext,ML::class.java)
            startActivity(intent)
        }
        buttonBlockChain.setOnClickListener {
            intent= Intent(applicationContext, BlockChain::class.java)
            startActivity(intent)

        }
        buttonDsa.setOnClickListener {
            intent= Intent(applicationContext, Dsa::class.java)
            startActivity(intent)

        }
        buttonContact.setOnClickListener {
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data=Uri.parse("tel:9735947179")
            startActivity(intent)
        }

    }
}