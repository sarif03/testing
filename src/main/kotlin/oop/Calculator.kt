package com.imahdev.oop

class Calculator {
    // jangan lupa selesaikan ini, untuk mengimplementasikan overloading

    fun add(value1:Int, value2: Int) = value1 + value2
    fun add(value1: Int, value2: Int, value3: Int) = value1 + value2 + value3
    fun add(value1: Double, value2: Double) = value1 + value2
    fun add(value1: Double, value2: Double, value3: Double) = value1 + value2 + value3

    fun min(value1:Int, value2: Int) = if (value1 < value2) value1 else value2
    fun min(value1: Double, value2: Double) = if (value1 < value2) value1 else value2
    
}