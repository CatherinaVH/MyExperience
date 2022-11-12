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
import com.example.myexperience.databinding.FragmentAddErvaringBinding

class AddErvaringFragment : Fragment() {

    private lateinit var viewModel: AddErvaringViewModel
    private lateinit var binding: FragmentAddErvaringBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_add_ervaring, container, false)

        val fact = AddErvaringViewModelFactory()

        viewModel = ViewModelProvider(this, fact).get(AddErvaringViewModel::class.java)

        binding.myModel = viewModel

        viewModel.error.observe(viewLifecycleOwner, Observer {
            if (it){
                showError()
            }
        })

        binding.setLifecycleOwner(this)

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

    fun showError() {
        val error = viewModel.errorText.value
        Toast.makeText(context, error, Toast.LENGTH_SHORT).show()
        viewModel.errorMessageHandled()
    }
}