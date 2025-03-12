package com.example.inicio.adapter

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.inicio.R
import com.example.inicio.model.ContactJSON
import com.example.inicio.ui.activity.ContactDetailsActivity

class ContactAdapter(var lista: List<ContactJSON>, var context: Context) :
    RecyclerView.Adapter<ContactAdapter.MyHolder>() {

    inner class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagen = itemView.findViewById<ImageView>(R.id.imageCard)
        val toolbar: Toolbar = itemView.findViewById(R.id.toolbarCard)
        val textPhone: TextView = itemView.findViewById(R.id.textCard)

        init {
            toolbar.inflateMenu(R.menu.contact_menu)
            toolbar.setOnMenuItemClickListener { menuItem: MenuItem ->
                when (menuItem.itemId) {
                    R.id.menuContactLlamar -> {
                        val phone = lista[adapterPosition].phone
                        if (phone != null) {
                            makeCall(phone)
                        }
                        true
                    }
                    R.id.menuContactDetalle -> {
                        val contact = lista[adapterPosition]
                        val intent = Intent(context, ContactDetailsActivity::class.java).apply {
                            putExtra("contact", contact)
                        }
                        context.startActivity(intent)
                        true
                    }
                    R.id.menuContactEliminar -> {
                        // Eliminar el contacto de la lista
                        (lista as ArrayList).removeAt(adapterPosition)
                        notifyItemRemoved(adapterPosition)
                        true
                    }
                    else -> false
                }
            }
        }

        private fun makeCall(phone: String) {
            val callIntent = Intent(Intent.ACTION_CALL).apply {
                data = Uri.parse("tel:$phone")
            }
            if (ActivityCompat.checkSelfPermission(
                    context,
                    Manifest.permission.CALL_PHONE
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                context.startActivity(callIntent)
            } else {
                // Verificar si el contexto es una instancia de AppCompatActivity
                if (context is androidx.appcompat.app.AppCompatActivity) {
                    ActivityCompat.requestPermissions(
                        context as androidx.appcompat.app.AppCompatActivity,
                        arrayOf(Manifest.permission.CALL_PHONE),
                        1
                    )
                } else {
                    Toast.makeText(context, "No se puede realizar la llamada.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val vista: View = LayoutInflater.from(context)
            .inflate(R.layout.item_recycler, parent, false)
        return MyHolder(vista)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val contact = lista[position]
        holder.toolbar.title = "${contact.firstName} ${contact.lastName}"
        holder.textPhone.text = contact.phone.toString()
        Glide.with(context).load(contact.image)
            .placeholder(R.drawable.base).into(holder.imagen)
    }

    fun addContact(contact: ContactJSON) {
        (lista as ArrayList).add(contact)
        notifyItemInserted(lista.size - 1)
    }
}
