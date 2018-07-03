package com.first_try.first.second.`in`

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    println(isLetter('a'))
    println(isNotDigit('a'))
    println(recognize('8'))
}

fun recognize(c:Char) = when (c){
    in '0'..'9'-> "Digit"
    in 'a'..'z',in 'A'..'Z'->"Letter"
    else -> "Unknown"
}