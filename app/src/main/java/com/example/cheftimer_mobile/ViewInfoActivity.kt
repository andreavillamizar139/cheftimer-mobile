package com.example.cheftimer_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ViewInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_info) // Asegúrate de usar el layout correcto

        // Encuentra el botón de "Cerrar Sesión"
        val logoutButton = findViewById<TextView>(R.id.btnLogout)
        logoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // Cierra la actividad actual
        }

        val btnDelete = findViewById<Button>(R.id.btnDelete)
        btnDelete.setOnClickListener {
            val intent = Intent(this, GestionManualAlarmasActivity::class.java)
            startActivity(intent)
            finish()
        }

        val btnCancel = findViewById<Button>(R.id.btnCancel)
        btnCancel.setOnClickListener {
            val intent = Intent(this, GestionManualAlarmasActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}