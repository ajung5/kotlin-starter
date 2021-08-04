package com.iseng.kotlin

fun main() {
    var bahasa = "Indo"
    bahasa = "Sunda"
    println(bahasa)
    /*
    val language = "English"
    language = "Java"
    println(language)
    */
    var total = 0
    val n = 2
    for(i in 0..n){
        for(j in 0..n-i){
            print(" ")
        }
        for(k in 0..i){
            print("* ")
            total++
        }
        println("")
    }
    println("Total perulangan $total")

   /* for (i in 0..n) {
        print(n)
    }*/
}