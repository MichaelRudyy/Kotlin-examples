package com.first_try.first.first

fun max(x: Int, y: Int): Int {
    return if (y > x) y else x
}

fun maxNew(x: Int, y: Int): Int = if (y > x) y else x

fun main(args: Array<String>) {
    println(maxNew(4,2))
}