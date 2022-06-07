package com.kotlinplayground.classes

data class Employee(
    val id: Int,
    val name: String
)
fun main(){

    val employee1 = Employee(1,"Jochen")

    println(employee1)

    val employee2 = employee1.copy()

    println(employee2)

}