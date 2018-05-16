package com.first.first.geometry.shapes

class Rectangle(val height:Int, val width:Int){
    val isSquare: Boolean
        get() = height == width
}