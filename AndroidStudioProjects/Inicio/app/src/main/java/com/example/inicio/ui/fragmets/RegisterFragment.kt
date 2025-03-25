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
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class RegisterFragment: Fragment() {

    private lateinit var binding: FragmentRegisterBinding
    private lateinit var datoRecuperado: String
    private lateinit var auth: FirebaseAuth

    override fun onAttach(context: Context) {
        super.onAttach(context)
        datoRecuperado = arguments?.getString("dato")!!
        auth = FirebaseAuth.getInstance()
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
            auth.createUserWithEmailAndPassword("manu1@gmail.com","Utad1234")
                .addOnCompleteListener {
                    if (it.isSuccessful){
                        Snackbar.make(binding.root,"Registro correcto", Snackbar.LENGTH_SHORT).show()
                        val user: FirebaseUser = auth.currentUser!!
                        Log.v("usuario", user.uid)
                    } else {
                        Snackbar.make(binding.root,"Registro incorrecto", Snackbar.LENGTH_SHORT).show()
                    }
                }
        }
        Log.v("datos", datoRecuperado)
    }
}