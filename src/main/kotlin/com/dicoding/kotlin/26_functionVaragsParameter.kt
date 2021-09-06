package com.dicoding.kotlin

fun hitungTotal(nama: String, vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }
    return total
}

fun main() {

    val result = hitungTotal("Ajung", 3,4 ,5 ,6, 7)
    println("Penjumlahan array $result")
}