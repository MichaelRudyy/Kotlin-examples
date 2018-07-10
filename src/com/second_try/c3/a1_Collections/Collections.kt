package com.second_try.c3.a1_Collections

fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 53);
    val list = listOf(1, 2, 3, 4, 5, 6)
    println(list.javaClass)
    println(joinToString(list))
}

fun <T> joinToString(collection: Collection<T>, separator: String = " ; ", prefix: String = "(", postfix: String = ")"):String {
    val result = StringBuilder(prefix)

    for ((index , element) in collection.withIndex()){
        if(index > 0 ) result.append(separator)
        result.append(element)
    }
    return result.append(postfix).toString()
}