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
import com.example.myexperience.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)

        val fact = MainViewModelFactory()
        viewModel = ViewModelProvider(this, fact).get(MainViewModel::class.java)
        viewModel.navigeerNaarGebruikerGegevens.observe(viewLifecycleOwner, Observer {
            if (it) {
                navigeerNaarGebruikerGegevens()
            }
        })

        viewModel.navigeerNaarErvaringen.observe(viewLifecycleOwner, Observer {
            if (it) {
                navigeerNaarErvaringen()
            }
        })

        binding.myModel = viewModel

        return binding.root
    }

    fun navigeerNaarGebruikerGegevens() {
        requireView().findNavController().navigate(MainFragmentDirections.actionMainFragmentToGebruikerFragment2())

    }

    fun navigeerNaarErvaringen() {
        requireView().findNavController().navigate(MainFragmentDirections.actionMainFragmentToWerkervaringFragment())
    }
}