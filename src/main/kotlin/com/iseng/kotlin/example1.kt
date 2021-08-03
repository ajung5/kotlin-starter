package com.iseng.kotlin

fun main () {
    /*
    val rentang = 1..100
    println (rentang.count())

    for (j in 1..10) {
        println(j)
    }
    */
    for (j in 1..15) {
        // if (j !in 4..7 ) print("-") else print(">")
        /*
        val prefix = if (j !in 4..7) "*" else ">"
        println("$prefix $j")
        */
        when (j) {
            in 4..8 -> {
                print("*")
            }
            in 12..13 -> {
                print(">")
            }
            else -> {
                print("-")
            }
        }
        println(j)
        /*
        val prefix: Unit = when (j) {
            in 4..8 -> {
                print("*")
            }
            !in 12..13 -> {
                print(">")
            }
            else -> {
                print("-")
            }
        }
        println("$prefix $j")
        */
        /*
        val prefix: Unit = if (j in 4..8 ) {
            print("*")
        }else if (j !in 12..13) {
            print(">")
        } else {
            print("-")
        }
        println("$prefix $j")
        */
    }
}