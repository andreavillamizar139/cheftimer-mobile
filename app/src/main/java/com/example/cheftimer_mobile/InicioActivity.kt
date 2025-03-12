package com.example.cheftimer_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)

        // Encuentra el botón de "Cerrar Sesión"
        val logoutButton = findViewById<TextView>(R.id.btnLogout)

        // Configurar el clic para regresar a la pantalla de inicio de sesión
        logoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)  // Solo inicia la pantalla sin borrar el historial
        }

        // Encuentra el botón de "microfono"
        val vozButton = findViewById<ImageView>(R.id.microphoneIcon)

        // Configurar el clic para regresar a la pantalla de voz
        vozButton.setOnClickListener {
            val intent = Intent(this, VozActivity::class.java)
            startActivity(intent)  // Solo inicia la pantalla sin borrar el historial
        }

    }
}