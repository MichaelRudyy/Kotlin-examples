package com.first.third.OOP

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    view.showOff()
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")