package com.dicoding.kotlin

fun main() {

    val lampu = "Merah"

    when (lampu) {
        "merah" -> println("Berhenti")
        "kuning" -> println("Hati-hati")
        "hijau" -> println("Jalan")
        else -> {
            println("Keywword anda salah")
        }
    }

    // multiple option
    val nilai = "D"
    when (nilai) {
        "A", "B", "C" -> println("Lulus")
        else -> {
            println("Coba lagi")
        }
    }
}

