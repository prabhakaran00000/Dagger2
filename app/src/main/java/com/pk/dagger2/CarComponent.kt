package com.pk.dagger2

import dagger.Component

@Component(modules = [WheelModule::class])
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}