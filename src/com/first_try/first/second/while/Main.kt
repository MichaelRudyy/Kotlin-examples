package com.first_try.first.second.`while`

fun whileDo(a:Int){
    var b = a
    while (b<=10){
        print("I am inside While $a")
        b.inc();
    }
    do {
        print("I am inside do and while $a")
    }while (b>10)
}

fun increment(){
    var a = 4
    a++
    println(a)
}

fun main(args: Array<String>) {
    val a =10
    /*whileDo(a);
    print(a)*/

    increment()


}