package com.dicoding.kotlin

fun main (){

    val rentang = 1..100
    val rentangTerbalik = 100 downTo  5
    val rentangStep = 99 downTo  9 step  2

    println(rentang.count()) // mendapatkan total data
    println(rentang.contains(46)) // mengecek apakah ada value tersebut
    println(rentang.contains(446)) // mengecek apakah ada value tersebut
    println(rentang.first) // mendapatkan nilai pertama
    println(rentang.last) // mendapatkan nilai terakhir
    println(rentang.step) // mendapatkan nilai tiap kenaikan
    println()
    println(rentangTerbalik.count()) // mendapatkan total data
    println(rentangTerbalik.contains(46)) // mengecek apakah ada value tersebut
    println(rentangTerbalik.contains(446)) // mengecek apakah ada value tersebut
    println(rentangTerbalik.first) // mendapatkan nilai pertama
    println(rentangTerbalik.last) // mendapatkan nilai terakhir
    println(rentangTerbalik.step) // mendapatkan nilai tiap kenaikan
    println()
    println(rentangStep.count())
    println(rentangStep.contains(9)) // mengecek apakah ada value tersebut
    println(rentangStep.contains(446)) // mengecek apakah ada value tersebut
    println(rentangStep.first) // mendapatkan nilai pertama
    println(rentangStep.last) // mendapatkan nilai terakhir
    println(rentangStep.step) // mendapatkan nilai tiap kenaikan

}