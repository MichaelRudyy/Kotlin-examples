package com.first_try.first.first.sum

fun main(args: Array<String>) {
    println(evalWhen(Sum(Sum(
            Num(1),
            Num(2)
    ),
            Num(4))))
}

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value;
    } else if (e is Sum) {
        return eval(e.right) + eval(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }
}

fun evalE(e: Expr): Int =
        if (e is Num) {
            e.value;
        } else if (e is Sum) {
            eval(e.right) + eval(e.left)
        } else {
            throw IllegalArgumentException("Unknown expression")
        }

fun evalWhen(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWhen(e.left)
                val right = evalWhen(e.right)
                println("sum: $left + $right")
                left+right
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }





