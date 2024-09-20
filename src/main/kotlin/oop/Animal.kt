package com.imahdev.oop

class Animal(
    // Primary Constructor
    var name: String,
    var weight: Double,
    var age: Int ,
    var isMammal: Boolean = true

) {
    init {
         weight = if( weight < 0) 0.1 else weight
        age = if(age < 0) 0 else age
    }

    // secondary contructor
    constructor(name: String) : this(name, 0.0,0,false) {
        println("Animal name \"$name\" created with default weight,age,isMammal")

    }

    // method | behaviour
    //......


}
