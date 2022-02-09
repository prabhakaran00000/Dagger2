package com.pk.dagger2

import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule constructor(val horsePower: Int){
    @Provides
    fun provideEngine(): Engine {
        return PetrolEngine(horsePower)
    }
}