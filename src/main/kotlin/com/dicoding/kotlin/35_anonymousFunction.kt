package com.dicoding.kotlin

// lambda akan menganggap baris terakhir blok lambda sebagai hasil kembalian
// kadang kita butuh membuat lambda yang se flexsible function, dimana kita bisa mengembalikan hasil dimanapun
// untuk hal ini, kita bisa menggunakan anonymous function
// anonymous function sebenarnya mirip dengan lambda, hanya cara membuatny aja yang sedikit beda,
// masih menggunakan kata kunci func

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        // variabel nameTransform dapat diisi oleh fungsi yang sudah dilewatkan sebagai parameter kedua dari fungsi hello()
        val nameTransform = transformer(name)
        return  "Wilujeung $nameTransform"
    }

    // nama variabel = fun (params1, params2,...): output data {
    // }

    val upper = fun (value: String): String {
        if(value == ""){
            return "Oops"
        }else{
            return value.toUpperCase()
        }
    }

    println(hello("Ajung", upper))
    println(hello("", upper))

    // anonymous function as parameter
    println(hello("John", fun (value: String): String {
       return value.toLowerCase()
    }))
}