package com.example.inicio.ui.activity

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.inicio.R
import com.example.inicio.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    // Vistas
    private lateinit var editNombre: EditText
    private lateinit var editCorreoReg: EditText
    private lateinit var editPassReg: EditText
    private lateinit var editPassConfirm: EditText
    private lateinit var spinnerPerfilReg: Spinner
    private lateinit var checkTerminos: CheckBox
    private lateinit var btnRegistrarUsuario: Button
    private lateinit var btnCancelarRegistro: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // findViewById de cada vista
        editNombre = findViewById(R.id.editNombre)
        editCorreoReg = findViewById(R.id.editCorreoReg)
        editPassReg = findViewById(R.id.editPassReg)
        editPassConfirm = findViewById(R.id.editPassConfirm)
        spinnerPerfilReg = findViewById(R.id.spinnerPerfilReg)
        checkTerminos = findViewById(R.id.checkTerminos)
        btnRegistrarUsuario = findViewById(R.id.btnRegistrarUsuario)
        btnCancelarRegistro = findViewById(R.id.btnCancelarRegistro)

        // Inicialmente deshabilitar el botón
        btnRegistrarUsuario.isEnabled = false

        // Listener para habilitar o deshabilitar el botón de registro cuando cambian los términos o los campos de texto
        checkTerminos.setOnCheckedChangeListener { _, _ -> habilitarBotonRegistro() }

        // Agregar TextWatcher para escuchar cambios en los campos
        val textWatcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) { habilitarBotonRegistro() }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        }

        // Escuchar los cambios en los campos de texto
        editNombre.addTextChangedListener(textWatcher)
        editCorreoReg.addTextChangedListener(textWatcher)
        editPassReg.addTextChangedListener(textWatcher)
        editPassConfirm.addTextChangedListener(textWatcher)

        // Acciones de los botones
        btnRegistrarUsuario.setOnClickListener {
            val nombre = editNombre.text.toString().trim()
            val correo = editCorreoReg.text.toString().trim()
            val pass = editPassReg.text.toString()
            val passConfirm = editPassConfirm.text.toString()

            // Obtener el perfil seleccionado del Spinner
            val perfilSeleccionado = spinnerPerfilReg.selectedItem.toString()

            // Validar que las contraseñas coincidan y los términos estén aceptados
            if (pass == passConfirm && checkTerminos.isChecked) {
                if (nombre.isNotEmpty() && correo.isNotEmpty() && pass.isNotEmpty()) {
                    // Navegar a la siguiente actividad (ShowUserActivity) y pasar todos los datos
                    val intent = Intent(this, ShowUserActivity::class.java).apply {
                        putExtra("nombre", nombre)
                        putExtra("correo", correo)
                        putExtra("contrasena", pass)
                        putExtra("perfil", perfilSeleccionado) // Agregar el rol seleccionado
                    }
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
                }
            } else if (!checkTerminos.isChecked) {
                Toast.makeText(this, "Debes aceptar los términos y condiciones para registrarte", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
            }
        }

        btnCancelarRegistro.setOnClickListener {
            finish()  // Cerrar la actividad
        }
    }

    override fun onRestart() {
        super.onRestart()
        // Limpiar los campos de texto
        editNombre.text.clear()
        editCorreoReg.text.clear()
        editPassReg.text.clear()
        editPassConfirm.text.clear()
        checkTerminos.isChecked = false
        btnRegistrarUsuario.isEnabled = false

        // Resetear el Spinner a la primera opción
        spinnerPerfilReg.setSelection(0)
    }

    // Método para habilitar o deshabilitar el botón de registro
    private fun habilitarBotonRegistro() {
        val isValidNombre = editNombre.text.isNotEmpty()
        val isValidCorreo = editCorreoReg.text.isNotEmpty()
        val isValidPass = editPassReg.text.isNotEmpty()
        val isValidPassConfirm = editPassConfirm.text.isNotEmpty()
        val isTermsChecked = checkTerminos.isChecked

        btnRegistrarUsuario.isEnabled = isValidNombre && isValidCorreo && isValidPass && isValidPassConfirm && isTermsChecked
    }
}
