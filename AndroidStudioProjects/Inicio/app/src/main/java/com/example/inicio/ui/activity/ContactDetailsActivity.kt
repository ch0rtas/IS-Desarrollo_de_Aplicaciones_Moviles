package com.example.inicio.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.inicio.R
import com.example.inicio.databinding.ActivityContactDetailsBinding

class ContactDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializar View Binding
        binding = ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtener datos del intent
        val contactName = intent.getStringExtra("contactName")
        val contactPhone = intent.getStringExtra("contactPhone")
        val contactImage = intent.getStringExtra("contactImage")

        // Asignar datos a la vista usando View Binding
        binding.textName.text = contactName
        binding.textPhone.text = contactPhone
        Glide.with(this).load(contactImage).placeholder(R.drawable.base).into(binding.imageContact)
    }
}
