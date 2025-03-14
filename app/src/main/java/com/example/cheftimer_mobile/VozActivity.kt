package com.example.cheftimer_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class VozActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.voz_activada)

        // Encuentra el botón de "Cerrar Sesión"
        val logoutButton = findViewById<TextView>(R.id.btnLogout)

        // Configurar el clic para regresar a la pantalla de inicio de sesión
        logoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Encuentra el botón de "Cerrar Sesión"
        val myAlarms = findViewById<TextView>(R.id.tabMyAlarms)

        // Configurar el clic para regresar a la pantalla de inicio de sesión
        myAlarms.setOnClickListener {
            val intent = Intent(this, GestionManualAlarmasActivity::class.java)
            startActivity(intent)
        }

        // Encuentra el botón de "VoiceOff"
        val voiceOff = findViewById<ImageView>(R.id.microphoneIconActive)

        voiceOff.setOnClickListener {
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }
    }
}