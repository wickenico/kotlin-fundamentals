package com.kotlinplayground.basics

import courseName
import topLevelFunction

class Variables {
}

fun main() {

    val name = "Dilip"
    println(name)

    var age = 34
    println(age)

    age = 35
    println(age)

    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}")

    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multLine1 = """
        ABC
        DEF
    """.trimIndent()

    println(multLine1)

    val num = topLevelFunction()
    println("Num is $num!")
    println("courseName: $courseName")

}