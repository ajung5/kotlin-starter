fun main() {
    hello("Ajung")
    hello("Nawawi", "ajung")
}

fun hello(firstName: String, lastName: String? = null){
    if (lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
   // println("Hello $firstName $lastName")
}