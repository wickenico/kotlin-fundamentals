package com.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory{
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main(){

    val course = Course(1, "Reactie Programm", "Nico Wickersheim")
    val course1 = Course(2, "Reactie Programm", "Nico Wickersheim")

    println("Checking object Equuality : ${course == course1}")

    val course3 = course1.copy(id = 2, author = "Dilldap")

    println(course3)

    val marketingCourse = Course(1, "Reactie Programm", "Nico Wickersheim", CourseCategory.MARKETING)

    println(marketingCourse)

}
