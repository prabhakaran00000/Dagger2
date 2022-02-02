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

class PetrolEngine @Inject constructor() : Engine {
    override fun start() {
        println("Petrol Engine started")
    }
}

class DieselEngine @Inject constructor() : Engine {
    override fun start() {
        println("Diesel Engine started")
    }
}