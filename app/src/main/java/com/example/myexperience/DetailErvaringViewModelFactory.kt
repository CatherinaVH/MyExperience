package com.example.myexperience

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class DetailErvaringViewModelFactory(private val werkErvaring:werkErvaring) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailErvaringViewModel::class.java)) {
            return DetailErvaringViewModel(werkErvaring) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}