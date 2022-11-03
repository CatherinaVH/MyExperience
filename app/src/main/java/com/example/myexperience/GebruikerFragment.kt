package com.example.myexperience

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import com.example.myexperience.databinding.FragmentGebruikerBinding

class GebruikerFragment : Fragment() {

    private lateinit var viewModel: GebruikerViewModel
    private lateinit var binding: FragmentGebruikerBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                    savedInstanceState: Bundle?): View? {


        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_gebruiker, container, false)


        val fact = GebruikerViewModelFactory()
        viewModel = ViewModelProvider(this, fact).get(GebruikerViewModel::class.java)

        viewModel.navigeerNaarGebruikerGegevens.observe(viewLifecycleOwner, Observer {
            if (it) {
                navigeerNaarGebruikerGegevens()
            }
        })


        binding.myModel = viewModel

        return binding.root
    }

    private fun navigeerNaarGebruikerGegevens() {
        var gebruiker: Gebruiker = viewModel.gebruiker.value!!
        // GEBRUIK DE FRAGMENTDIRECTIONS VAN HET FRAGMENT WAARIN JE WERKT
        //requireView().findNavController().navigate(MainFragmentDirections.actionMainFragmentToGebruikerFragment2(gebruiker))
        requireView().findNavController().navigate(GebruikerFragmentDirections.actionGebruikerFragmentToWijzigenGegevensGebruikerFragment())
    }


}