package com.example.inicio.ui.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.inicio.R
import com.example.inicio.databinding.ActivitySecondBinding
import com.example.inicio.model.User
import com.example.inicio.ui.dialog.InfoDialog

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        obtenerDatos()

    }

    private fun obtenerDatos() {
        // Obtener los datos directamente desde el Intent
        val correo = intent.getStringExtra("correo")
        val contrasena = intent.getStringExtra("contrasena")
        val perfil = intent.getStringExtra("perfil")

        // Puedes hacer algo con los datos aquí, como mostrarlos en la interfaz
        supportActionBar?.title = correo // Por ejemplo, mostrar el correo en el ActionBar
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.itemCerrarSesion ->{finish()}
            R.id.itemInformacion ->{
                // escribir el codigo del cuadro de dialogo aqui
                // escribir el codigo del cuadro de dialogo en una clase
                val dialogo: InfoDialog = InfoDialog()
                dialogo.show(supportFragmentManager,null)
            }
            R.id.itemAccion1 ->{}
            R.id.itemAccion2 ->{}
        }

        return true
    }
}
