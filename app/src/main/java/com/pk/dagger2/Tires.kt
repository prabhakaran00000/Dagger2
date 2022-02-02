package com.pk.dagger2

class Tires {
    /*Assume We are not own this class. So that constructor injection is not possible, in such case
    modules will provides this object*/
    fun inflate(){
        println("Inflating tires")
    }
}
