package com.dicoding.kotlin

fun main() {

    val result = 10.0 / 3.0  // 0.0 untuk mengubah tipe data menjadi float
    println(result)

    val results = 16 - 2 * 4
    println(results)


    // augmented assignments
    var total: Int = 0   // menggunakan var karena variable (total) immutable
    var jumlah: Int = 0

    val barang2 = 15
    val barang1 = 10

    total += barang1    // bentuk lain dari (total  = total + barang1)
    total += barang2

    jumlah += barang1
    jumlah /= barang2

    println(total)
    println(jumlah)

    //unary operator

    total ++    // total = total + 1
    total ++
    total --
    println(total)

    var suhu: Int = -7
    suhu ++
    println(suhu)

    val sehat = true
    println(!sehat) // boolean kebalikan
}