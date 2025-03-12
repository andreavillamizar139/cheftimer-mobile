package com.example.cheftimer_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encuentra el botón en el XML
        val loginButton = findViewById<Button>(R.id.loginButton)

        // Configura el clic para abrir la nueva pantalla
        loginButton.setOnClickListener {
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent) // Abre InicioActivity
        }
    }
}