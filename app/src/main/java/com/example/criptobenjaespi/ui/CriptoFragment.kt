package com.example.criptobenjaespi.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.criptobenjaespi.R
import com.example.criptobenjaespi.databinding.FragmentCriptoBinding

class CriptoFragment : Fragment(R.layout.fragment_cripto) {

    private lateinit var binding: FragmentCriptoBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCriptoBinding.bind(view)
    }

}