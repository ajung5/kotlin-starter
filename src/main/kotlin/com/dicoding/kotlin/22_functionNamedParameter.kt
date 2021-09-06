package com.dicoding.kotlin

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String) {
    println("Selamat pagi $firstName $middleName $lastName")
}

fun main() {
    fullName("ajung", "nawawi", "doe")
    fullName(
        firstName = "AJUNG",
        middleName = "NAWAWI",
        lastName = "DOE"
    )
}