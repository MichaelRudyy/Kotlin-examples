package com.second_try.c3.a3_additional_attributes

var StringBuilder.lastChar
    get() = this.get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }