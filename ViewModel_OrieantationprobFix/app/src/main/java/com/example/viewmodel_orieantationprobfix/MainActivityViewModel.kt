package com.example.viewmodel_orieantationprobfix

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {

    private var counter=0

    fun getCurrentCount():Int{
        return counter
    }
    fun getupdatedCount():Int{
        return ++counter
    }

}