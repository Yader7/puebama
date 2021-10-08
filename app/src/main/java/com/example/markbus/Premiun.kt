package com.example.markbus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Premiun : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_premiun)

        val btng = findViewById<Button>(R.id.btnGuard)
        btng.setOnClickListener {
            val in1 = Intent(this, Monitoriar::class.java)
            startActivity(in1)

        }

        val btncan = findViewById<Button>(R.id.cancelar)
        btncan.setOnClickListener {
            val in1 = Intent(this, Menu::class.java)
            startActivity(in1)

        }
    }

}