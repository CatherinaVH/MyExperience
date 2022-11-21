package com.example.myexperience

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myexperience.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

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

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        val supportActionBar: ActionBar? = (requireActivity() as AppCompatActivity).supportActionBar
        if (supportActionBar != null) supportActionBar.hide()
    }

    override fun onStop() {
        super.onStop()
        val supportActionBar = (requireActivity() as AppCompatActivity).supportActionBar
        supportActionBar?.show()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

    fun navigeerNaarGebruikerGegevens() {
        var gebruiker: Gebruiker = viewModel.gebruiker.value!!
        requireView().findNavController()
            .navigate(MainFragmentDirections.actionMainFragmentToGebruikerFragment2(gebruiker))
        viewModel.naarGebruikerGegevensFinishec()
    }

    fun navigeerNaarErvaringen() {
//        requireView().findNavController()
//            .navigate(MainFragmentDirections.actionMainFragmentToWerkervaringFragment())
//        viewModel.naarErvaringenFinished()
    }
}