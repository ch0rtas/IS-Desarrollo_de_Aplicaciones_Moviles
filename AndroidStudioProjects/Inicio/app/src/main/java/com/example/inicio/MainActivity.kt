package com.example.inicio
/*
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.inicio.databinding.ActivityMainBinding
import com.example.inicio.model.User
*/

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.inicio.model.User
import com.example.inicio.R
import com.example.inicio.SecondActivity
import com.example.inicio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*
    private lateinit var binding: ActivityMainBinding
    private lateinit var check: CheckBox
    private lateinit var editPass: EditText
    private lateinit var editCorreo: EditText
    private lateinit var spinnerPerfil: Spinner
    private lateinit var butonLogin: Button
    */

    private lateinit var binding: ActivityMainBinding
    private lateinit var check: CheckBox
    private lateinit var butonLogin: Button
    private lateinit var spinnerPerfil: Spinner
    private lateinit var editCorreo: EditText
    private lateinit var editPass: EditText

    // FALTA ESTE
    private lateinit var butonRegistro: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Si usas viewBinding, descomenta la línea de abajo y elimina el `setContentView(R.layout.activity_main)`
        // setContentView(binding.root)
        setContentView(R.layout.activity_main)

        /*
        check = findViewById(R.id.checkInicio)
        butonLogin = findViewById(R.id.btnLogin)
        editPass = findViewById(R.id.editPass)  // Reemplaza con el ID real de tu campo de contraseña
        editCorreo = findViewById(R.id.editCorreo)  // Reemplaza con el ID real de tu campo de correo
        spinnerPerfil = findViewById(R.id.spinnerPerfil)  // Reemplaza con el ID real de tu spinner
        */

        // Enlazamos vistas
        check = findViewById(R.id.checkInicio)
        butonLogin = findViewById(R.id.btnLogin)
        spinnerPerfil = findViewById(R.id.spinnerPerfil)
        editCorreo = findViewById(R.id.editCorreo)
        editPass = findViewById(R.id.editPass)

        check = findViewById(R.id.checkInicio)
        butonLogin = findViewById(R.id.btnLogin)

        // ENLAZAMOS TAMBIÉN btnRegistro
        butonRegistro = findViewById(R.id.btnRegistro)
        acciones()
    }

    override fun onRestart() {
        super.onRestart()
        editCorreo.text.clear()
        editPass.text.clear()
        check.isChecked = false
    }

    private fun acciones() {
        check.setOnCheckedChangeListener { _, isChecked ->
            butonLogin.isEnabled = isChecked
        }

        butonLogin.setOnClickListener {
            // Recoger datos del usuario
            val correo = editCorreo.text.toString()
            val pass = editPass.text.toString()

            // Crear Intent para cambiar de pantalla
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("correo", correo)
                putExtra("contraseña", pass)
            }
            startActivity(intent)
        }

        butonRegistro.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

    }
}
