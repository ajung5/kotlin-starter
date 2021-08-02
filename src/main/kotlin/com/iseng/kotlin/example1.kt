package com.iseng.kotlin

fun main () {
    for (i in 1..0) {
        val  prefix = if (i !in 4..7) "-" else ">"
        println("$prefix $i")
    }

}