package com.pk.dagger2

import dagger.Component
import dagger.Module
import dagger.Provides

@Module
object WheelModule {
    @Provides
    fun provideRims() = Rims()

    @Provides
    fun provideTires() = Tires().apply { inflate() }

    @Provides
    fun provideWheel(rims: Rims, tires: Tires) = Wheel(rims,tires)
}