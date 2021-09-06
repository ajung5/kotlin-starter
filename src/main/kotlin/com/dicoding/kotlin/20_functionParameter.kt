fun main() {
    bioData( "ajung", lastName = null, 13)
    bioData( "John", null, 19)
    bioData("Janne", "Doe", 12)
    bioData("mark", "zukk", 21)
    bioData("Mikael", umur = 10)
}

fun bioData(firstName: String, lastName: String? = null, umur: Int){
    if (lastName == null && umur <= 17) {
        println("Nama anda  $firstName anda belum cukup umur, karena anda berumur $umur Tahun")
    }else if (lastName == null){
        println("Nama anda  $firstName dan usia anda $umur Tahun")
    }else if (umur <= 17) {
        println("Halo $firstName $lastName anda belum cukup umur, karena anda berumur $umur Tahun")
    }else {
        println("Nama $firstName $lastName dan usia anda $umur Tahun")
    }

}