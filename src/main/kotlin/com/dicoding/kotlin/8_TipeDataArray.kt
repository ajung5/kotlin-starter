package com.dicoding.kotlin

//fun main(args: Array<String>) {
//    val hargaBarang = intArrayOf(5000, 8000, 7000)
//    var totalHarga = 0
//    hargaBarang.forEach({ totalHarga = totalHarga + it })
//    println(totalHarga)
//}

fun main (){
    val mhs: Array<String> = arrayOf("Ajung", "Nawawi", "John", "Doe")
    val mahasiswa = arrayOf<String>("janne", "Doe")

    // menampilkan size array
    println(mhs.size)
    println(mahasiswa.size)

    //


    // looping index array
    for (element in mhs){
        println(element)
    }

    for (nama in mahasiswa){
        println(nama)
    }

    // menampilkan data pada index
    println(mhs[3])

}