package com.kotlinplayground.classes

open class User(val name: String) {

    open var isLoggedIn: Boolean = false

    open fun login(){
        println("Inside user login")
    }

}

class Student(name: String): User(name) {

    override var isLoggedIn: Boolean = false

    companion object {
        const val noOfEnrolledCourses = 10
        fun country() = "USA"
    }

    override fun login(){
        println("Inside student login")
        super.login()
    }
}

class Instructor(name: String): User(name)

fun main() {
    val student = Student("Jochen")
    student.login()
    student.isLoggedIn = true
    println("Logged in value is : ${student.isLoggedIn}")
    println("name is: ${student.name}")

    val country = Student.country()
    println(country)
    println("noOfEnrolledCourses is: ${Student.noOfEnrolledCourses}")

    val instructor = Instructor("Frank")
    instructor.login()
    println("name is: ${instructor.name}")
}