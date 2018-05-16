package com.first.first.geometry.example

import com.first.first.geometry.shapes.Rectangle
import java.util.*


fun main(args: Array<String>) {
    var rect = getRandromRectangle();
    println(rect.isSquare)
}

fun getRandromRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}