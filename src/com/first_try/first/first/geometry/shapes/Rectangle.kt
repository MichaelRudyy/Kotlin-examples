package com.first_try.first.first.geometry.shapes

class Rectangle(val height:Int, val width:Int){
    val isSquare: Boolean
        get() = height == width

    var isSomething: Boolean = false
        set(value){
            isSomething = value;
        }


}