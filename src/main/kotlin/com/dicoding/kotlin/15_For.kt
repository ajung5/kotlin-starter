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

    val ukuranArray = names.size -1
    for (i in 0..ukuranArray) {
        println("Index $i = ${names.get(i)}")
    }

    // loop range
    var jumlah = 0
    for (nilai in 1..10 step 2){
        println(nilai)
        jumlah++
    }
    println("Jumlahnya adalah $jumlah")
}