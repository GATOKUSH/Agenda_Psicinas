package com.GATOKUSH.agenda_psicinas
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity





class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        val btnComenzar = findViewById<Button>(R.id.btnComenzar)
        // Configurar el evento de clic del botón
        btnComenzar.setOnClickListener {
            // Aquí puedes definir lo que sucede al hacer clic en el botón
            // Por ejemplo, abrir una nueva actividad
            val intent = Intent(this, Semana::class.java)
            startActivity(intent)


        }
        val btnCalendario: Button = findViewById(R.id.btnCalendario)
        btnCalendario.setOnClickListener {
            // Inicia la actividad Calendario
            val intent = Intent(this, Calendario::class.java)
            startActivity(intent)
        }
    }
}