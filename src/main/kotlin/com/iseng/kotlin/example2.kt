package com.iseng.kotlin

fun main(args: Array<String>) {
    //halfPyramid()
    //halPyramidAngka()
    halfPyramidHuruf()
    //invHalfPyramid()
    //invHalfPramidAngka()
}

//contoh 1
fun halfPyramid() {
    val rows = 5

    for (i in 1..rows) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

// contoh 2
fun invHalfPyramid() {
    //val rows = 5

    for (i in 5 downTo 1) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

//contoh 3
fun halPyramidAngka(){
    //val row = 5

    for (i in 1..5) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}

//contoh 4
fun invHalfPramidAngka() {
    for (i in 5 downTo 1) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}

// contoh 5
fun halfPyramidHuruf() {
    val last = 'G'
    var alphabet = 'A'

    for (i in 1..last - 'A' + 1) {
        for (j in 1..i) {
            print("$alphabet ")
        }
        alphabet++

        println()
    }
}

//contoh 6


