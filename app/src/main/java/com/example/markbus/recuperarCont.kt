package com.example.markbus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class recuperarCont : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_cont)

        val txtre =  findViewById<Button>(R.id.enviar)
        txtre.setOnClickListener {
            val usuario = findViewById<TextView>(R.id.txtusuario)
            val int2 = Intent( this, CodVerificacion::class.java)
            startActivity(int2)
        }
    }
}