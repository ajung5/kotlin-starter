package com.iseng.kotlin

fun main() {
    val names: Array<String> = arrayOf("John", "Doe")
    val mix = arrayOf(1, 2 , "John", "Doe")
    //println(names)

    println(mix.size)

    println("Jumlah aray: ${names.size}")
    for (name in names) {
        println(name)
    }

    for (mixs in mix) {
        println(mixs)
    }
}