package com.pk.dagger2

import javax.inject.Inject

class Remote @Inject constructor(){
    fun setListener(car: Car){
        println("Car connected")
    }
}