package com.pk.dagger2

import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {
   /* Here engine is abstract, so we are not able to inject without implementation, In this case
    we will provide implementation, here petrol engine have constructor injection so we don't
    need to provide custom logic. so we need to use Bind annotation instead of Provide, Binds methods
    are more concise because they are declared as abstract methods without a body, and they are more
    efficient because Dagger doesn't have to invoke them or even instantiate their containing module. */
    @Binds
    abstract fun provideEngine(petrolEngine: PetrolEngine): Engine
}