package com.dicoding.kotlin

fun main() {

    // percabangan if
    val nilai = 80

    if (nilai >= 75){
        println("Selamat anda Lulus")
    } else {
        println("Coba Lagi")
    }

    //percabangan esle if

    val value = 70

    if ( value >= 80 ) {
        println("Hadiah Mobil")
    } else if ( value >= 60 ) {
        println("Hadiah Motor")
    } else {
        println("Coba Lagi")
    }


    val nilaiUTS = 67.0
    val nilaiUAS = 76.0
    val nilaiEskul = 79.0
    val hasil: Double = (nilaiUAS + nilaiUTS + nilaiEskul) / 3

    if (hasil >= 75) {
        println("Nilai A")
    }else if (hasil >= 65) {
        println("Nilai B")
    } else {
        println("Coba Lagi")
    }

    println(hasil)

}