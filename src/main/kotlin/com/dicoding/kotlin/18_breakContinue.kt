package com.dicoding.kotlin

fun main() {
    var i = 0
    while (i < 10) {
        println("$i break")
        i++
        if (i > 20){
            break
        }
    }

    for (i in 1..100) {
        if (i % 2 == 1) {
            continue
        }
        println(i)
    }
}