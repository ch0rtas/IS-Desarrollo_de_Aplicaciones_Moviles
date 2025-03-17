package com.example.inicio.ui.fragmets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.inicio.R
import com.example.inicio.databinding.FragmentLoginBinding

class LoginFragment: Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.btnRegistro.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("dato","esto es un dato a pasar entre dos fragemnt")
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment, bundle)
        }
    }
}