package com.example.markbus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.text.TextUtils

import android.widget.EditText

import android.util.Patterns
import android.view.MenuItem
import android.widget.Toast
import java.lang.NumberFormatException
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        //Llamado de el Splash Screen a la pantalla principal
       // Thread.sleep(1000)
        setTheme(R.style.SplashTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtMenu =  findViewById<Button>(R.id.btniniciar)
        txtMenu.setOnClickListener {
            val usuario = findViewById<TextView>(R.id.txtusuario)
            val int2 = Intent( this, Menu::class.java)
            startActivity(int2)
        }

       //Inicializacion de pantallas
        val txtRegi = findViewById<TextView>(R.id.txtRes)
        txtRegi.setOnClickListener {
            val intento1 = Intent(this, Registrarse::class.java)
            startActivity(intento1)

        }

        //llamado con el boton para la pantalla menú
        val recuperar = findViewById<TextView>(R.id.txtRecuperar)
        recuperar.setOnClickListener {
            val re = Intent( this, recuperarCont::class.java)
            startActivity(re)
        }


    }

}


