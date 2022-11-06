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
import com.example.myexperience.databinding.FragmentWerkervaringBinding

class WerkervaringFragment : Fragment() {

    private lateinit var viewModel: WerkervaringViewModel
    private lateinit var binding: FragmentWerkervaringBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_werkervaring, container, false)

        val fact = WerkervaringViewModelFactory()
        viewModel = ViewModelProvider(this, fact).get(WerkervaringViewModel::class.java)

        viewModel.navigeerNaarwerkErvaring.observe(viewLifecycleOwner, Observer {
            if (it) {
                navigeerNaarDetailErvaringen1()
            }
        })

        viewModel.navigeerNaarwerkErvaring.observe(viewLifecycleOwner, Observer {
            if (it) {
                navigeerNaarDetailErvaringen2()
            }
        })

        binding.myModel = viewModel

        return binding.root
    }

    private fun navigeerNaarDetailErvaringen1() {
        var werkErvaring1: werkErvaring = viewModel.ervaring1.value!!
        requireView().findNavController()
            .navigate(WerkervaringFragmentDirections.actionWerkervaringFragmentToDetailErvaringFragment(werkErvaring1))
        viewModel.navigateToWerkErvaringenFinished()
    }

    private fun navigeerNaarDetailErvaringen2() {
        var werkErvaring2: werkErvaring = viewModel.ervaring2.value!!
        requireView().findNavController()
            .navigate(WerkervaringFragmentDirections.actionWerkervaringFragmentToDetailErvaringFragment(werkErvaring2))
        viewModel.navigateToWerkErvaringenFinished()
    }
}