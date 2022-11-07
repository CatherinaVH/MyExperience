package com.example.myexperience

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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

        viewModel.voegNieuweErvaringToe.observe(viewLifecycleOwner, Observer {
            if (it) {
                navigeerNaarNieuweToevoegen()
            }
        })

        binding.myModel = viewModel

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
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

    private fun navigeerNaarDetailErvaringen3() {
        var werkErvaring3: werkErvaring = viewModel.ervaring3.value!!
        requireView().findNavController()
            .navigate(WerkervaringFragmentDirections.actionWerkervaringFragmentToDetailErvaringFragment(werkErvaring3))
        viewModel.navigateToWerkErvaringenFinished()
    }

    private fun navigeerNaarDetailErvaringen4() {
        var werkErvaring4: werkErvaring = viewModel.ervaring4.value!!
        requireView().findNavController()
            .navigate(WerkervaringFragmentDirections.actionWerkervaringFragmentToDetailErvaringFragment(werkErvaring4))
        viewModel.navigateToWerkErvaringenFinished()
    }

    private fun navigeerNaarNieuweToevoegen() {
        requireView().findNavController()
            .navigate(WerkervaringFragmentDirections.actionWerkervaringFragmentToAddErvaringFragment())
        viewModel.navigateToAddWerkervaringFinished()
    }

}