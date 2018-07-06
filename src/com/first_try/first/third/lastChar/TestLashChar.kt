package com.first_try.first.third.lastChar

val String.lastChar: Char
get() = get(length -1)

var StringBuilder.lastChar: Char
get() = get(length-1)
set(value: Char){
    this.setCharAt(length-1,value);
}

fun main(args: Array<String>) {
    println("kotlin".lastChar)
    val A = StringBuilder("qwertyuio")
    A.lastChar = '!';
    println(A.toString())
}