package com.example.markbus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CodVerificacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cod_verificacion)

        val btnini = findViewById<Button>(R.id.enviarRe)
        btnini.setOnClickListener {
            val in1 = Intent(this, MainActivity::class.java)
            startActivity(in1)

        }
    }
}