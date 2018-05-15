package com.first.first

fun main(args: Array<String>) {
    var list = arrayListOf<Int>(1,2,3)
    list.add(1)
    list.add(3)
    list = arrayListOf(1,2,3);
    println(list)
}

fun testVal(): Unit {
    val list = arrayListOf<Int>(1,2,3)
    list.add(1)
    list.add(3)
    println(list)
}
