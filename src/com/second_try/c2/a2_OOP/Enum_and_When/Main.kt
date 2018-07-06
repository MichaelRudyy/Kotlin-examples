package com.second_try.c2.a2_OOP.Enum_and_When

fun main(args: Array<String>) {
    println(getColor(Color.RED))
}

fun getColor(color: Color):String {
    when (color) {
        Color.BLUE, Color.RED -> return "B or R"
        Color.GREEN -> return "G"
    }
    return "null"
}
