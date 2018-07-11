package com.second_try.c3.a2_Additional_Function

fun String.lastChar(): Char = this.get(this.length-1).toChar()

fun String.lastWord(): String{
    val lastWord = this.split(" ").last();
    return lastWord;
}

fun <T> Collection<T>.toString(prefix:String = "{", postfix:String = "}", separator:String = ""):String{
    var str = StringBuilder(prefix);
    this.forEach { str.append("$it$separator") };
    str.deleteCharAt(str.lastIndex);
    str.append(postfix);
    return str.toString()
}