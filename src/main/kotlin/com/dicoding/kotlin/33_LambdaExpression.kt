package com.dicoding.kotlin

fun hurufKapital(value: String): String = value.toUpperCase()

fun main() {

    // lambda expression di Variable
    // val namaVariabel: (typedata1, typedata2, ...) -> return value = {param1: type data, param2: type data ->
    // isi kode / body
    // }
    // membuat lambda untuk 2 parameter
    val contohLambda: (String, String) -> String = {firstName: String, lastName ->
        val result = "$firstName $lastName"
        result
    }

    //memanggil lambda
    val result = contohLambda("Ajung", "Nawawi")
    println(result)

    //membuat lambda untuk 1 parameter (it)
    //it merepresentasikan parameter pada lambda
    val sayHello: (String) -> String = {
        "Hello $it"
    }
    //memamnggil lambda
    println(sayHello("John"))

    // function/method references
    // lambda expression dari function yg udah ada
    //  val namaVariabel: (typedata) -> return value = :: functionReferences

    //membuat lambda
    val kapital: (String) -> String = :: hurufKapital

    // memanggil lambda
    println(kapital("Asep"))
}