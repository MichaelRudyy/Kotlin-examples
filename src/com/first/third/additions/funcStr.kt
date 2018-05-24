package com.first.third.additions

fun String.getLastChar(): Char = this.get(this.length-1)



fun main(args: Array<String>) {
    println("abcd".getLastChar())
}