import java.time.LocalDate

fun main() {

    printName("Jochen")
    val result = addition(1, 2)
    println("Result is $result")

    val result1 = addition_approach(1, 2)
    println("Result is $result")

    printPersonDetails("Jochen", "abc@gmail.com", LocalDate.parse("2000-01-01"))

    printPersonDetails(name = "Jochen", dob = LocalDate.parse("2000-01-01"))
}

fun addition(x: Int, y: Int) : Int {
    return x+y
}

fun addition_approach(x: Int, y: Int) = x+y

fun printName(name: String): Unit {
    println("name is $name")
}

fun printPersonDetails(name: String, email: String = "", dob: LocalDate = LocalDate.now()) {
    println("Name is $name and the email is $email and the dob ist $dob .")
}

