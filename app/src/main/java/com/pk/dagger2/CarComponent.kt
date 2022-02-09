package com.pk.dagger2

import dagger.Component

@Component(modules = [WheelModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}