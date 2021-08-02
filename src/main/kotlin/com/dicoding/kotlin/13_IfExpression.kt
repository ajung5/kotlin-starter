package com.dicoding.kotlin

fun main() {

    // percabangan if
    val nilai = 80

    if (nilai >= 75){
        println("Selamat anda Lulus")
    } else {
        println("Coba Lagi")
    }
    println()

    //percabangan esle if
    val value = 70

    if ( value >= 80 ) {
        println("Hadiah Mobil")
    } else if ( value >= 60 ) {
        println("Hadiah Motor")
    } else {
        println("Coba Lagi")
    }
    println()

    val nilaiUTS = 67.0
    val nilaiUAS = 74.0
    val nilaiEskul = 79.0
    val nilaiAbsen = 76.0
    val hasil: Double = (nilaiUAS + nilaiUTS + nilaiEskul + nilaiAbsen) / 4

    if (hasil >= 75) {
        println("Lulus")
    }else if (hasil >= 70 && nilaiAbsen >= 75) {
        println("Lulus Dengan Syarat")
    } else {
        println("Coba Lagi Tahun Depan")
    }

    println("Dengan nilai $hasil")

}