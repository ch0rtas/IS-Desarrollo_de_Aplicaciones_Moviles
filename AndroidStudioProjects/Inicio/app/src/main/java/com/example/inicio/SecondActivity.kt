package com.example.inicio

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.inicio.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtener los datos enviados desde RegisterActivity
        val nombre = intent.getStringExtra("nombre")
        val correo = intent.getStringExtra("correo")
        val contraseña = intent.getStringExtra("contraseña")
        val perfil = intent.getStringExtra("perfil") // Obtener el perfil seleccionado

        // Enlazar los datos a las vistas
        val textBienvenido: TextView = findViewById(R.id.textBienvenido)
        val textCorreo: TextView = findViewById(R.id.textCorreo)
        val textContraseña: TextView = findViewById(R.id.textContraseña)
        val textPerfil: TextView = findViewById(R.id.textPerfil)  // TextView para mostrar el perfil

        // Mostrar el mensaje de bienvenida con el nombre del usuario
        textBienvenido.text = getString(R.string.bienvenido) + " " + nombre

        // Mostrar el correo, la contraseña y el perfil
        textCorreo.text = getString(R.string.correo) + " " + correo
        textContraseña.text = getString(R.string.contraseña) + " " + contraseña
        textPerfil.text = getString(R.string.perfil) + " " + perfil  // Mostrar el perfil
    }
}
