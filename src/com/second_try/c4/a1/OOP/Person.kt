package com.second_try.c4.a1.OOP

private class Person(val age: Int, val name: String) {
    val tenTimesAge = 10 * age;

    inner class Kid(val age: Int) {
        fun something(): Int {
            return this@Person.tenTimesAge
        }
    }
}