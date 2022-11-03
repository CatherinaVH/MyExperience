package com.example.myexperience

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class WijzigenGegevensGebruikerFragment : Fragment() {

    companion object {
        fun newInstance() = WijzigenGegevensGebruikerFragment()
    }

    private lateinit var viewModel: WijzigenGegevensGebruikerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_wijzigen_gegevens_gebruiker, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WijzigenGegevensGebruikerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}