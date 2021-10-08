package com.example.markbus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val btnAc = findViewById<Button>(R.id.btnMonitoriar)
        btnAc.setOnClickListener {
            val int1 = Intent(this, Premiun::class.java)
            startActivity(int1)

        }
        val btnM = findViewById<Button>(R.id.btnMarkbus)
        btnM.setOnClickListener {
            val in1 = Intent(this, MapsActivity::class.java)
            startActivity(in1)

        }


    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_contextual, menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.Opcion_one) {

            startActivity(Intent(this, Configuracion::class.java))
        }
        if (item.itemId == R.id.Opcion_two) {

            startActivity(Intent(this, Soporte::class.java))
        }

        return super.onOptionsItemSelected(item)
    }



}