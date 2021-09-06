package com.dicoding.kotlin

fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(j: Int, k: Int): Int {
    if (k == 0) {
        return 0
    }else {
        val result = j / k
        return result
    }

    /*val result = j / k
    return result*/
}


fun main() {
    println(sum(12, 13))

    val penjumlahan = sum(4, 6)
    println(penjumlahan)

    println("hasil dari penjumlahan ${sum(6, 6)}")

    sum(7, 7) // kode tersebut akan di ignore atau di abaikan, karena tidak ditampung dalam variable

    //println(bagi(20.0, 0))
    val pembagian = bagi(25, 2)
    println("hasil bagi = $pembagian")
}

