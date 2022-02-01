package com.pk.dagger2

import dagger.Component

@Component
interface CarComponent {
    // Provision method
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}