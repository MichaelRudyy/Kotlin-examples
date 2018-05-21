package com.first.second.trycatch

import java.io.BufferedReader
import java.io.StringReader

fun readNumbers(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        println("reader is closing")
        reader.close()
    }
}

fun readNumber1(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        //return
        null
    }
    println("$number  sdsd")
}

fun main(args: Array<String>) {
/*    print(readNumbers(
            BufferedReader(StringReader("2a39"))
    ))*/

    val a = if(2>0) 5 else 0
    println(a)

    readNumber1(BufferedReader(StringReader("1a2")))
}

