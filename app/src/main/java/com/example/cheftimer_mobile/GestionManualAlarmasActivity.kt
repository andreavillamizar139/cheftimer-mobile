package com.example.cheftimer_mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textview.MaterialTextView

class GestionManualAlarmasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gestion_manual_alarmas)

        // Botón de Cerrar Sesión
        val logoutButton = findViewById<TextView>(R.id.btnLogout)
        logoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Pestaña Activar Voz
        val tabActivateVoice = findViewById<MaterialTextView>(R.id.tabActivateVoice)
        tabActivateVoice.setOnClickListener {
            val intent = Intent(this, VozActivity::class.java)
            startActivity(intent)
        }

        // Referencias para alternar entre Play/Pause (para la primera alarma)
        val btnPause = findViewById<ImageButton>(R.id.btnPause)
        val btnPlay = findViewById<ImageButton>(R.id.btnPlay)

        btnPause.setOnClickListener {
            btnPause.visibility = View.GONE
            btnPlay.visibility = View.VISIBLE
        }

        btnPlay.setOnClickListener {
            btnPlay.visibility = View.GONE
            btnPause.visibility = View.VISIBLE
        }

        // Botón de eliminar alarma
        val btnDeleteAlarm = findViewById<ImageButton>(R.id.btnDeleteAlarm)
        btnDeleteAlarm.setOnClickListener {
            val intent = Intent(this, ViewInfoActivity::class.java)
            startActivity(intent)
        }

        val btnDeleteAlarm2 = findViewById<ImageButton>(R.id.btnDeleteAlarm2)
        btnDeleteAlarm2.setOnClickListener {
            val intent = Intent(this, ViewInfoActivity::class.java)
            startActivity(intent)
        }
    }
}
