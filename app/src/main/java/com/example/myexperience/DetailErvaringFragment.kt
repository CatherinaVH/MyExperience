package com.example.myexperience

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DetailErvaringFragment : Fragment() {

    private lateinit var viewModel: DetailErvaringViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        viewModel = ViewModelProvider(this).get(DetailErvaringViewModel::class.java)

        return inflater.inflate(R.layout.fragment_detail_ervaring, container, false)
    }
}