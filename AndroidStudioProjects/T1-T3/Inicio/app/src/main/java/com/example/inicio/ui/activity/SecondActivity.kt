package com.example.inicio.ui.activity

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.inicio.R
import com.example.inicio.adapter.ContactAdapter
import com.example.inicio.data.DataSet
import com.example.inicio.databinding.ActivitySecondBinding
import com.example.inicio.model.ContactJSON
import com.example.inicio.model.User
import com.example.inicio.ui.dialog.InfoDialog
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import org.json.JSONArray
import org.json.JSONObject

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private lateinit var contactAdapter: ContactAdapter
    private lateinit var listaContacts: ArrayList<ContactJSON>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        instancias()
        obtenerDatos()
        cargarDatos()
    }

    private fun cargarDatos(){
        val gson = Gson()
        val url = "https://dummyjson.com/users"
        val peticion: JsonObjectRequest = JsonObjectRequest(url, {
            val users: JSONArray = it.getJSONArray("users")
            for (i in 0..users.length()-1) {
                val userJSON: JSONObject = users.getJSONObject(i)
                // Log.v("datos", userJSON.getString("firstName"))
                // ContactJSON -> Object
                val contact: ContactJSON = gson.fromJson(userJSON.toString(), ContactJSON::class.java)
                // listaContacts.add(contact)
                contactAdapter.addContact(contact)
                Log.v("datos", contact.firstName ?:"sin firstName")
            }
            //contactAdapter.notifyDataSetChanged()
        }, {
            Snackbar.make(binding.root, "Error en la conexión con la API.", Snackbar.LENGTH_SHORT).show()
        })
        Volley.newRequestQueue(applicationContext).add(peticion)
    }

    private fun instancias() {
        listaContacts = ArrayList()
        contactAdapter = ContactAdapter(listaContacts, this)
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
