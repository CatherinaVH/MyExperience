package com.example.myexperience

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myexperience.databinding.FragmentDetailErvaringBinding
import com.example.myexperience.databinding.FragmentGebruikerBinding
import com.example.myexperience.databinding.FragmentWerkervaringBinding

class DetailErvaringFragment : Fragment() {

    private lateinit var viewModel: DetailErvaringViewModel
    private lateinit var binding: FragmentDetailErvaringBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail_ervaring, container, false)

        val args = DetailErvaringFragmentArgs.fromBundle(requireArguments())

        //val fact = DetailErvaringViewModelFactory(args.WerkErvaring)
        viewModel = ViewModelProvider(this).get(DetailErvaringViewModel::class.java)

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
}