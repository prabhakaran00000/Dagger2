package com.pk.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val build = DaggerCarComponent.builder().petrolEngineModule(PetrolEngineModule(1000)).build()
        build.inject(this)
        car.drive()
    }
}