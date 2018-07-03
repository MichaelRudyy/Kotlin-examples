package com.second_try.c2.a1

val language = arrayListOf("Java")

fun main(args: Array<String>) {
    language.add("Kotlin")
    // here we add new element to val value and its ok
    // its mean that link to array is not change but array is changeable
    println(language)
}