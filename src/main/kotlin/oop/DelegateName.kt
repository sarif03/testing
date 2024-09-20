package com.imahdev.oop

import kotlin.reflect.KProperty

class DelegateName {
    private var value: Any = "Defaultt"

    operator fun getValue(classRef:Any?, property: KProperty<*>): Any {
        println("Fungsi ini sama seerti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("nilai ${property.name} dari : $value akan berubah menjadi $newValue")
        value = newValue
    }
}