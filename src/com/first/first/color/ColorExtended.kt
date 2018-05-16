package com.first.first.color

enum class ColorExtended(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 166, 0),
    YELLOW(255, 255, 0);

    fun rgb() = (r * 256 + g) * 256 + b;
}