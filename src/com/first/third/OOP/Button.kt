package com.first.third.OOP

import com.first.third.OOP.View

class Button: View(){
    override val className = "Button"
    override fun click() = println("Button clicked $className")
}