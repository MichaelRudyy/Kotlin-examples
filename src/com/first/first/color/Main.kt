package com.first.first.color

fun main(args: Array<String>) {
    println(ColorExtended.RED.rgb())
    println(getMnemonic(Color.RED))
    println(getWarmth(Color.VIOLET))
    println(getWarmth(Color.BLUE,Color.ORANGE))
}