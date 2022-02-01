package com.pk.dagger2

import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheel: Wheel){
    fun drive() {
        println("Driving the car")
    }
}