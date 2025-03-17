package com.example.inicio.ui.activity

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.inicio.R
import com.example.inicio.databinding.ActivityContactDetailsBinding
import com.example.inicio.model.ContactJSON
import com.google.gson.Gson
import org.json.JSONArray
import org.json.JSONObject

class ContactDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Recoger el objeto ContactJSON enviado desde el Adapter
        val contact = intent.getSerializableExtra("contact") as? ContactJSON

        contact?.let { c ->
            // Cargar la imagen en el ImageView
            Glide.with(this)
                .load(c.image)
                .placeholder(R.drawable.base)
                .into(binding.imageContact)

            // Convertir el objeto a JSON usando Gson
            val gson = Gson()
            val jsonString = gson.toJson(c)
            val jsonObject = JSONObject(jsonString)

            // Obtener el contenedor dinámico del layout y agregar los campos
            val container = binding.containerDynamic
            addJsonToContainer(jsonObject, container)
        }
    }

    /**
     * Función recursiva para agregar los campos del objeto JSON al contenedor.
     * @param jsonObject Objeto JSON con los datos del contacto.
     * @param container Contenedor LinearLayout donde se añadirán los TextViews.
     * @param indent String de indentación para mostrar estructuras anidadas.
     */
    private fun addJsonToContainer(jsonObject: JSONObject, container: LinearLayout, indent: String = "") {
        val keys = jsonObject.keys()
        while (keys.hasNext()) {
            val key = keys.next()
            val value = jsonObject.get(key)
            val textView = TextView(this).apply {
                textSize = 16f
            }

            when (value) {
                is JSONObject -> {
                    // Mostrar el nombre del objeto y luego sus propiedades recursivamente
                    textView.text = "$indent$key:"
                    container.addView(textView)
                    addJsonToContainer(value, container, "$indent   ")
                }
                is JSONArray -> {
                    // Mostrar el nombre del arreglo y luego cada elemento
                    textView.text = "$indent$key:"
                    container.addView(textView)
                    for (i in 0 until value.length()) {
                        val item = value.get(i)
                        if (item is JSONObject) {
                            addJsonToContainer(item, container, "$indent   ")
                        } else {
                            val arrayItemTv = TextView(this).apply {
                                textSize = 16f
                                text = "$indent   - $item"
                            }
                            container.addView(arrayItemTv)
                        }
                    }
                }
                else -> {
                    // Mostrar campos simples (String, Number, Boolean, etc.)
                    textView.text = "$indent$key: $value"
                    container.addView(textView)
                }
            }
        }
    }
}
