package com.example.markbus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.markbus.databinding.ActivityMainBinding
import org.w3c.dom.Text

class Registrarse : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)


        val usuario = findViewById<TextView>(R.id.txtReUsuario)
        val email = findViewById<TextView>(R.id.txtEmail)
        val contraseña = findViewById<TextView>(R.id.txtContraseña)
        val reCon = findViewById<TextView>(R.id.txtConfContra)
        val txtMenu = findViewById<Button>(R.id.btnregistrar)

        txtMenu.setOnClickListener {
            val int3 = Intent(this, Menu::class.java)
            startActivity(int3)


        }
    }
    fun registarse()
    {

    }



}