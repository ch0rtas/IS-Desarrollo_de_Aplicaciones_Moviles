package com.example.inicio.ui.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.inicio.R
import com.example.inicio.adapter.ContactAdapter
import com.example.inicio.data.DataSet
import com.example.inicio.databinding.ActivitySecondBinding
import com.example.inicio.model.User
import com.example.inicio.ui.dialog.InfoDialog

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        instancias()
        obtenerDatos()
    }

    private fun instancias() {
        contactAdapter = ContactAdapter(DataSet.lista, this)
        binding.recycler.adapter = contactAdapter

        // Configuración del RecyclerView según la orientación
        if (resources.configuration.orientation == 1) { // Modo vertical
            binding.recycler.layoutManager = LinearLayoutManager(
                applicationContext, LinearLayoutManager.VERTICAL, false
            )
        } else { // Modo horizontal
            binding.recycler.layoutManager = GridLayoutManager(
                applicationContext, 2, LinearLayoutManager.VERTICAL, false
            )
        }
    }

    private fun obtenerDatos() {
        val correo = intent.getStringExtra("correo")
        val perfil = intent.getStringExtra("perfil")

        supportActionBar?.title = correo ?: "Sin correo"
    }
    
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.itemCerrarSesion -> finish()
            R.id.itemInformacion -> {
                val dialogo = InfoDialog()
                dialogo.show(supportFragmentManager, null)
            }
            R.id.itemAccion1 -> { /* Acción 1 */ }
            R.id.itemAccion2 -> { /* Acción 2 */ }
        }
        return true
    }
}
