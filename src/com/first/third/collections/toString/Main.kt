package com.first.third.collections.toString

fun main(args: Array<String>) {
    val set = hashSetOf(1,7,53)
    val list = arrayListOf(1,7,53)
    val map = hashMapOf(1 to "one",7 to "seven", 53 to "fifty-three")
    map[5]="five"

    println(list.javaClass)

    println(list.joinToStringMy())
}