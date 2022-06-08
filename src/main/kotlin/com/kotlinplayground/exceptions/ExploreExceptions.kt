package com.kotlinplayground.exceptions

fun returnNothing(): Nothing {
    throw RuntimeException("Exception")
}

fun main() {

    println("Name length is ${nameLength("Jochen")}")
    println("Name length is ${nameLength(null)}")
    returnNothing()

}

fun nameLength(name: String?): Int? {
    val result = try {
        name!!.length
    } catch (e: Exception) {
        println("Exception is : $e")
        null
    }

    return result
}
