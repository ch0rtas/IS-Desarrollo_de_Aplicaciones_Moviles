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

        // Obtener los datos enviados desde MainActivity o RegisterActivity
        val nombre = intent.getStringExtra("nombre")
        val correo = intent.getStringExtra("correo")
        val contraseña = intent.getStringExtra("contraseña")

        // Enlazar los datos a las vistas
        val textBienvenido: TextView = findViewById(R.id.textBienvenido)
        val textCorreo: TextView = findViewById(R.id.textCorreo)
        val textContraseña: TextView = findViewById(R.id.textContraseña)

        // Mostrar el mensaje de bienvenida con el nombre del usuario
        textBienvenido.text = getString(R.string.bienvenido) + " " + nombre

        // Mostrar el correo y la contraseña
        textCorreo.text = getString(R.string.correo) + " " + correo
        textContraseña.text = getString(R.string.contraseña) + " " + contraseña
    }
}
