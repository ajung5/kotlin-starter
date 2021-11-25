package com.dicoding.kotlin

// tail recursive function adalah teknik mengubah recursive function menjadi looping biasa ketika dijalankan

fun main() {
    tailrec fun display (value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display (value - 1)
        }
    }

    display(25)
}