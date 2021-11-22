package com.dicoding.kotlin

fun main() {
    fun sayHello(name: String = ""): String {
        // kode tanpa menggunakan fitur if return
//        if (name == ""){
//            return "Hello Bro!!"
//        }else{
//            return "Hello $name"
//        }

        // kode dengan menggunakan fitur if return
//        return if (name == ""){
//            "Hello Kisanak!!"
//        }else{
//            "hello $name"
//        }
        // kode tanpa menggunakan fitur when return
//        when(name) {
//            "" -> return "Hello Kang!!"
//            else -> return "Hello $name"
//        }

        // kode tanpa menggunakan dengan fitur if return
        return when(name) {
            "" -> "Hello Kang!!"
            else -> "Hello $name"
        }
    }

    println(sayHello())
    println(sayHello("Ajung"))
}
