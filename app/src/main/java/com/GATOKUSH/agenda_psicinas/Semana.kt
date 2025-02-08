package com.GATOKUSH.agenda_psicinas

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Semana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_semana)
        val btnLunes: Button = findViewById(R.id.btnLunes)
        val btnMartes: Button = findViewById(R.id.btnMartes)
        val btnMiercoles: Button = findViewById(R.id.btnMiercoles)
        val btnJueves: Button = findViewById(R.id.btnJueves)
        val btnViernes: Button = findViewById(R.id.btnViernes)
        val btnSabado: Button = findViewById(R.id.btnSabado)
        val btnListaClientes: Button = findViewById(R.id.btnListaClientes)

    }
}