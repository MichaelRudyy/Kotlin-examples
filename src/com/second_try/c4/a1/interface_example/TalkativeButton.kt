package com.second_try.c4.a1.interface_example

import com.second_try.c4.a1.interface_example.interfaces.Focusable

internal class TalkativeButton : Focusable {
    private fun yell() = println("yell")
    internal fun whisper() = println("Let's talk!")
    fun TalkativeButton.giveSpeach(){
        yell()
        whisper()
    }

}
internal fun TalkativeButton.giveSpeach(){
    // yell() - error because its private
    whisper()
}


fun main(args: Array<String>) {

}