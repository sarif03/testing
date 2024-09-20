package com.imahdev.oop


class Person {
    //menampilkan teks
    init {
        println("semangat belajarnya")
    }

    var name: Any by DelegateName()
    var age: Any by DelegateName()
    var gender: Char = '-'
    var height: Int = 0
    var weight: Int = 0
        //modifikasi Getter & Setter khusus properti weight
        get() {
            println("ini adalah get dari property weight. modifikasi sendiri didalam class ${Person::class.java}")
            return field
        }
        set(value) {
            println("ini setter dari properti age. modifikasi sendiri didalam class ${Person::class.java}")
            field = value
        }

    fun eat() {
        println("$name is eating!")
    }

    fun sleep() {
        println("$name is sleeping")
    }

    fun bath() {
        println("he is bathing")
    }

}