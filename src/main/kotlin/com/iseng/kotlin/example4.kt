package com.iseng.kotlin

fun main() {
    val names: Array<String> = arrayOf("John", "Doe", "Janne", "Doe")
    val angka: Array<Int> = arrayOf(2, 5, 7, 12, 15)
    var total = 0

    for (name in names){
        println(name)
        total++
    }
    println("Jumlah perulangan = $total")
    println(angka[1])

}

//i >= 0 && j <=10