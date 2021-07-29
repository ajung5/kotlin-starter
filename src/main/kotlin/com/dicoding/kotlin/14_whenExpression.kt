package com.dicoding.kotlin

fun main() {

    val lampu = "merah"

    when (lampu) {
        "merah" -> println("Berhenti")
        "kuning" -> println("Hati-hati")
        "hijau" -> println("Jalan")
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

