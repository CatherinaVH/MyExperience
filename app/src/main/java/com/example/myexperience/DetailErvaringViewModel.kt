package com.example.myexperience

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailErvaringViewModel(__ervaring: WerkErvaring) : ViewModel() {

    private var _ervaring : MutableLiveData<WerkErvaring> = MutableLiveData()
    val ervaring: LiveData<WerkErvaring>
        get() {
            return _ervaring
        }



    init {
        _ervaring.value = __ervaring
     }

}