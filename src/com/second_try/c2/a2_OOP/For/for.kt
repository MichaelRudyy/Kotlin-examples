import java.util.*
import kotlin.collections.ArrayList

fun print(x: IntRange) {
    x
            .filter { it > 5 }
            .sortedBy { it }
            .forEach { println(it) }
}

fun smthng() {
    val size = 20
    for (i in size downTo 1 step 2) {
        print("$i ")
    }
    println()
    for (i in 0..size) {
        print("$i ")
    }
    println()
    for (i in 0 until size) {
        print("$i ")
    }
}

fun binarySMT() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun printWithIndex(array: ArrayList<Int>) {
    array[0]++;

    for ((index, element) in array.withIndex()) {
        array[index] += 200;
        println("$index: $element")

    }
    array.forEach {
        print("$it ")
    }
}



