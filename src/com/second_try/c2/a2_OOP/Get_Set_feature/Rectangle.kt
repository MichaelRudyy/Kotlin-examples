package com.second_try.c2.a2_OOP.Get_Set_feature

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width;
    var color: String = "white"
        set(value){
            field = value;
        };
    var счёт = 59;
}