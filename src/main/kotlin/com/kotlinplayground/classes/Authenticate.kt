package com.kotlinplayground.classes

object Authenticate {

    fun authentiate(userName: String, password: String) {
        println("User authenticate for userName: $userName")
    }

}

fun main() {
    Authenticate.authentiate("Jochen", "abc")
}