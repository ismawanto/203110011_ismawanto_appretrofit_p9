package com.velmurugan.a203110011_ismawanto_appretrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
// TODO 4: Untuk class view model

class MyViewModelFactory constructor(private val repository: MainRepository): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            MainViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}