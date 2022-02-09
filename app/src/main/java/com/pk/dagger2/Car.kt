package com.pk.dagger2

import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheel: Wheel){
    // Method Injection
    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        println("Driving the car")
    }
}

class PetrolEngine constructor(val horsePower: Int) : Engine {

    override fun start() {
        println("Petrol Engine started $horsePower")
    }
}

class DieselEngine @Inject constructor() : Engine {
    override fun start() {
        println("Diesel Engine started")
    }
}