package com.second_try.c4.a1.OOP

import java.io.Serializable

interface State: Serializable

interface View{
    fun getCurrentState(): State
    fun restoreState(state: State){}
}