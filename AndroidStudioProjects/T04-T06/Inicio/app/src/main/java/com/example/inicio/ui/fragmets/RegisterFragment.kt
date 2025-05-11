package com.example.inicio.ui.fragmets

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.inicio.R
import com.example.inicio.databinding.FragmentRegisterBinding
import com.example.inicio.model.User
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.FirebaseDatabase

class RegisterFragment: Fragment() {

    private lateinit var binding: FragmentRegisterBinding
    private lateinit var datoRecuperado: String
    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase

    override fun onAttach(context: Context) {
        super.onAttach(context)
        datoRecuperado = arguments?.getString("dato")!!
        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance("https://fb-manu-default-rtdb.europe-west1.firebasedatabase.app/")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.btnCancelarRegistro.setOnClickListener{
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment2)
        }
        binding.btnRegistrarUsuario.setOnClickListener {
            auth.createUserWithEmailAndPassword(
                binding.editCorreoReg.text.toString(),
                binding.editPassReg.text.toString()
            )
                .addOnCompleteListener {
                    if (it.isSuccessful){
                        Snackbar.make(binding.root,"Registro correcto", Snackbar.LENGTH_SHORT).show()
                        guardarUsuario(
                            User(
                                nombre = binding.editNombre.text.toString(),
                                telefono = binding.editTelefono.text.toString().toInt(),
                                pass = binding.editPassReg.text.toString(),
                                correo = binding.editCorreoReg.text.toString()
                            ), auth.currentUser!!.uid
                        )
                        val user: FirebaseUser = auth.currentUser!!
                        Log.v("usuario", user.uid)
                    } else {
                        Snackbar.make(binding.root,"Registro incorrecto", Snackbar.LENGTH_SHORT).show()
                    }
                }
        }
        Log.v("datos", datoRecuperado)
    }

    private fun guardarUsuario(usuario: User, uid: String) {
        // guardar los datos del usuario en la base de datos
        /*database.reference.child("usuarios")
            .child(uid).child("nombre").setValue(usuario.nombre)*/
        database.reference.child("usuarios")
            .child(uid).setValue(usuario)
    }
}