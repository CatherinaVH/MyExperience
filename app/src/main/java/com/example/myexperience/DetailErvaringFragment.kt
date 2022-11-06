package com.example.myexperience

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
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

        val fact = DetailErvaringViewModelFactory(args.werkErvaring)
        viewModel = ViewModelProvider(this, fact).get(DetailErvaringViewModel::class.java)

        binding.myModel = viewModel

        return binding.root

    }
}