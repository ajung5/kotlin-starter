package com.dicoding.kotlin

fun main() {

    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiEskul = 60

    val isLulusUjian = nilaiUjian >= 70
    val isLulusAbsen = nilaiAbsen >= 80
    val isLulusEskul = nilaiEskul >= 75

    val isLulus = isLulusUjian && !isLulusAbsen
    println(isLulus)


    val isPass = isLulusAbsen && isLulusEskul && isLulusUjian
    println(isPass)

    val lampu1 = "Merah"
    val lampu2 = 2
    val lampu3 = 3
    

    val isKondisi1 = lampu1 >= "Merah"
    val isKondisi2 = lampu2 >= 2

    val isBerhenti = isKondisi1 || isKondisi2

    println(isBerhenti)

}