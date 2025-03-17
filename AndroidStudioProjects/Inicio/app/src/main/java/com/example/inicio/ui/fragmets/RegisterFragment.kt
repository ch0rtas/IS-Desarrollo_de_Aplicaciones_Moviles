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

class RegisterFragment: Fragment() {

    private lateinit var binding: FragmentRegisterBinding
    private lateinit var datoRecuperado: String

    override fun onAttach(context: Context) {
        super.onAttach(context)
        datoRecuperado = arguments?.getString("dato")!!
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
        Log.v("datos", datoRecuperado)
        binding.btnCancelarRegistro.setOnClickListener{
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment2)
        }
    }
}