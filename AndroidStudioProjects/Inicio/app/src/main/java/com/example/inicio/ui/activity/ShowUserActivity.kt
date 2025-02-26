package com.example.inicio.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.inicio.R
import com.example.inicio.databinding.ActivityShowUserBinding

class ShowUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShowUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtener los datos enviados desde RegisterActivity
        val nombre = intent.getStringExtra("nombre")
        val correo = intent.getStringExtra("correo")
        val contrasena = intent.getStringExtra("contrasena")
        val perfil = intent.getStringExtra("perfil") // Obtener el perfil seleccionado

        // Enlazar los datos a las vistas
        val textBienvenido: TextView = findViewById(R.id.textBienvenido)
        val textCorreo: TextView = findViewById(R.id.textCorreo)
        val textContrasena: TextView = findViewById(R.id.textContrasena)
        val textPerfil: TextView = findViewById(R.id.textPerfil)  // TextView para mostrar el perfil

        // Mostrar el mensaje de bienvenida con el nombre del usuario
        textBienvenido.text = getString(R.string.bienvenido) + " " + nombre

        // Mostrar el correo, la contraseña y el perfil
        textCorreo.text = getString(R.string.correo) + " " + correo
        textContrasena.text = getString(R.string.contraseña) + " " + contrasena
        textPerfil.text = getString(R.string.perfil) + " " + perfil  // Mostrar el perfil

        // Botón Atrás (Cerrar la actividad)
        val btnAtras: Button = findViewById(R.id.btnAtras)
        btnAtras.setOnClickListener {
            finish() // Cierra la actividad actual
        }

        // Botón Continuar (Mostrar mensaje)
        val btnContinuar: Button = findViewById(R.id.btnContinuar)
        btnContinuar.setOnClickListener {
            // Crear un Intent para iniciar la actividad SecondActivity
            val intent = Intent(this, SecondActivity::class.java)

            // Pasar los datos al Intent
            intent.putExtra("nombre", nombre)
            intent.putExtra("correo", correo)
            intent.putExtra("contrasena", contrasena)
            intent.putExtra("perfil", perfil)

            // Iniciar SecondActivity
            startActivity(intent)
        }
    }
}
