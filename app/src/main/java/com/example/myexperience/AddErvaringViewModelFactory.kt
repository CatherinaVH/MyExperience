package com.example.myexperience

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class AddErvaringViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AddErvaringViewModel::class.java)) {
            return AddErvaringViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}