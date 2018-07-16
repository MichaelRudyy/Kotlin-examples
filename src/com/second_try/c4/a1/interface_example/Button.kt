package com.second_try.c4.a1.interface_example

import com.second_try.c4.a1.interface_example.interfaces.Clickable
import com.second_try.c4.a1.interface_example.interfaces.Focusable

class Button : Clickable, Focusable {
    override fun info() {
        super<Clickable>.info()
        super<Focusable>.info()
    }

    override fun click() {
        println("Click")
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        TODO("Something")
    }

}