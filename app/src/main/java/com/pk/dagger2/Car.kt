package com.pk.dagger2

import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheel: Wheel){
    // Method Injection
    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    fun drive() {
        println("Driving the car")
    }
}