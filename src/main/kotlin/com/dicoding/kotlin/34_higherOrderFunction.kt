package com.dicoding.kotlin

// function yang menggunakan function sebagai parameter atau mengembalikan function
fun main() {

    // nama function(params1, params2/lambda,...) : Return value {}
    fun hello(name: String, transformer: (String) -> String): String {
        // variabel nameTransform dapat diisi oleh fungsi yang sudah dilewatkan sebagai parameter kedua dari fungsi hello()
        val nameTransform = transformer(name)
        return  "Wilujeung $nameTransform"
    }

    val lambdaUpper = {value:String -> value.toUpperCase()}
    println(hello("Ajung", lambdaUpper))

    // memasukan lambda didalam parameter, ga usah bikin variable dulu
    println(hello("John", {value: String -> value.toLowerCase()}))

    // # trailing lambda
    val result = hello("Doe"){value: String ->
        value.toUpperCase()
    }
    println(result)
}