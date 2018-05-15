package com.first.first

data class Person(val name: String,
                  val age: Int? = null) // Допускаеться значение null (из за ? )

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),
            Person("Bob",29),
            Person("Mark",30),
            Person("Dave",25))
    val oldest = persons.maxBy { it.age ?:0 } // WTF?
    // ?: - Элвис
    // если age = null то он заменяет его на 0
    print("The oldest is : $oldest");
}