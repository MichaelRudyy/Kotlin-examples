package com.second_try.c4.a1.interface_example.interfaces

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus")
    fun info() = println("Focusable")
}