package com.example.jetpackarchit.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// if we use view model class with blank constructor then use ViewModelProvider it require only
//context and view model object    exp > class MainViewModel : ViewModel(){}
      // and
// if we use view model class with argument constructor then make MainViewModelFactory
// that extends ViewModelProvider.Factory  it require only
//context with factory instance  and view model object

// Livedata is used only for read purpose  and  MutableLiveData used for Read & Write purpose
class MainViewModel (val initialval : Int): ViewModel() {
    val qut = MutableLiveData("LeadConcept")
    var count = initialval

    fun increment(){
        count++

        qut.value = "LeadConcept Developers"
    }
}