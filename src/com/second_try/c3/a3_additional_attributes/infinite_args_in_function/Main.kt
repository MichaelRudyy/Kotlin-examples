package com.second_try.c3.a3_additional_attributes.infinite_args_in_function

fun <T> arrayToList(vararg array:T): List<T>{
    val list = arrayListOf<T>()
    array.forEach { list.add(it) }
    return list;
}

fun main(args: Array<String>) {
    val array = intArrayOf(1,3,5,7,4)
    println(arrayToList("aa",5))
}