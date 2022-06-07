package com.kotlinplayground.cast

import com.kotlinplayground.classes.Course
import java.util.StringJoiner

fun main() {

    val course = Course(1, "Reactie Programm", "Nico Wickersheim")

    checkType(course)
    checkType("Nico")

    castNumber(1.0)
    castNumber(1)

}

fun castNumber(any: Any) {

    when(any) {
        any as Double -> println("Value is Double")
    }

}

fun checkType(type: Any) {

    when(type) {
        is Course -> {
            println(type.copy())
        }
        is String -> {
            println(type.lowercase())
        }
    }

}
