package com.example.myexperience

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class WerkervaringViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WerkervaringViewModel::class.java)) {
            return WerkervaringViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}