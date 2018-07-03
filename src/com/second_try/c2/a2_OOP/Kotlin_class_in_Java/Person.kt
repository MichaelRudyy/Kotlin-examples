package com.second_try.c2.a2_OOP.Kotlin_class_in_Java

class Person(val name: String, var isMale:Boolean?){
    override fun toString(): String {
        return "Person(name='$name', isMale=$isMale)"
    }
}
