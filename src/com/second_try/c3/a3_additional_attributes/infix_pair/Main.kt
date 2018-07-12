package com.second_try.c3.a3_additional_attributes.infix_pair

infix fun Any.toDo(other:Any) = Pair(this,other)

fun main(args: Array<String>) {
    12.toDo("asa")
    val map = mapOf(12 toDo 32,12 toDo "aa",12.toDo(32));
    val (num,text) = 12 to "aaa"
    println(num)
    println(text)
}