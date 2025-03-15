package com.example.cheftimer_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textview.MaterialTextView

class GestionManualAlarmasNoDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gestion_manual_alarmas_no_data)

        // Encuentra el botón de "Cerrar Sesión"
        val logoutButton = findViewById<MaterialTextView>(R.id.btnLogout)
        logoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        //tabActivateVoice

        val tabActivateVoice = findViewById<MaterialTextView>(R.id.tabActivateVoice)
        tabActivateVoice.setOnClickListener {
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }
    }
}