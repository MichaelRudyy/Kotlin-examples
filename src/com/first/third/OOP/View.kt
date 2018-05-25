package com.first.third.OOP

open class View{
    open val className = "View"
    open fun click() = println("View clicked + $className")
}