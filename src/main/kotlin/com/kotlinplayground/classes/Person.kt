package com.kotlinplayground.classes

class Person(val name: String = "", val age: Int = 0) {

    var email : String = ""
    constructor(_email: String) : this() {
        email = _email
    }

    var nameLength: Int = 0

    init {
        println("Inside Init Block")
        nameLength = name.length
        println(nameLength)
    }

    fun action() {
        println("Person Walks")
    }

}

fun main() {
   /* val person = Person("Nico", 27)
    person.action()
    println("Name: ${person.name} and the age is ${person.age}")

    val person1 = Person()
    println("Name: ${person1.name} and the age is ${person1.age}")*/

    val person2 = Person(_email = "abc@gmail.com")
    println("Name: ${person2.name} and the age is ${person2.age} and the email is ${person2.email}")
}