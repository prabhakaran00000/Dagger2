package com.pk.dagger2

import dagger.Component

@Component(modules = [WheelModule::class, DieselEngineModule::class])
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}