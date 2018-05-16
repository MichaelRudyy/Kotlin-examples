package com.first.first.java

fun main(args: Array<String>) {
    val person = Person();
    person.name = "bob"
    person.isMarried = true
    println(person.toString())
}

class Person1(val name: String,
              var isMarried: Boolean
){
    
}