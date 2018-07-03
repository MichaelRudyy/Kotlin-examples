package com.first_try.first.first.color

import com.first_try.first.first.color.Color.*

fun getMnemonic(color: Color): String {
    when (color) {
        Color.RED -> return "Каждый";
        Color.ORANGE -> return "Охотник";
        Color.YELLOW -> return "Желает";
        Color.GREEN -> return "Знать";
        Color.BLUE -> return "Где";
        Color.INDIGO -> return "Сидит";
        Color.VIOLET -> return "Фазан";
    }
}

fun getWarmth(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "Тёплый"
    GREEN -> "Нейтральный"
    BLUE, INDIGO, VIOLET -> "Холодный"
}

fun getWarmth(x: Color, y: Color) = when (setOf(x, y)) {
    setOf(ORANGE, YELLOW) -> "Тёплый"
    setOf(GREEN, BLUE) -> "Нейтральный"
    setOf(INDIGO, VIOLET) -> "Холодный"
    else -> throw Exception("Грязный цвет");
}

fun getWarmthOpt(x: Color, y: Color) = when {
    (x == ORANGE && y == YELLOW) || (x == YELLOW && y == ORANGE) -> "Тёплый"
    (x == GREEN && y == BLUE) || (x == BLUE && y == GREEN) -> "Нейтральный"
    (x == INDIGO && y == VIOLET) || (x == VIOLET && y == INDIGO) -> "Холодный"
    else -> throw Exception("Грязный цвет");
}

