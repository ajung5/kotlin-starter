package com.dicoding.kotlin

fun main() {

    // loop array
    val names: Array<String> = arrayOf("John", "Doe", "Janne", "Doe")
    var total = 0

    for (name in names){
        println(name)
        total++
    }
    println("Jumlah perulangan = $total")

    // loop range
    var jumlah = 0
    for (nilai in 1..10 step 2){
        println(nilai)
        jumlah++
    }
    println("Jumlahnya adalah $jumlah")
}