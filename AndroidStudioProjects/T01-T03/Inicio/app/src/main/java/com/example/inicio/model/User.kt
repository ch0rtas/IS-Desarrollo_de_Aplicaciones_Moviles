package com.example.inicio.model

import java.io.Serializable

// Clase User que utiliza correo en lugar de nombre
class User(
    var correo: String? = null, // Correo reemplaza a "nombre"
    var nombre: String? = null,
    var pass: String? = null,
    var perfil: String? = null
) : Serializable {

    private var telefono: Int? = null

    constructor(correo: String, pass: String, perfil: String, telefono: Int) : this(correo, pass, perfil) {
        this.telefono = telefono
    }
}
