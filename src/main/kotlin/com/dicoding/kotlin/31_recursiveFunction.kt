package com.dicoding.kotlin

// recursive function yang memanggil function dirinya sendiri

fun main() {

    // menggunakan for
    fun factorialLoop(value: Int) : Int {
        var result = 1
        for(i in value downTo 1) {
            result *= i
        }
        return result
    }

    // menggunakan function recursive
    fun factorialRecursive(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialLoop(value -1)
        }
    }

    println(factorialRecursive(6))
    println(factorialLoop(5))
}