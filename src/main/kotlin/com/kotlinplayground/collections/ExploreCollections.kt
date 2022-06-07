package com.kotlinplayground.collections

fun main() {

    val names = listOf("Jochen", "Pat", "Frank")
    println("Names are $names")

    val mutableNames = mutableListOf("Jochen", "Pat", "Frank")
    mutableNames.add("Haraldo")
    println("Names are $mutableNames")

    val set = setOf("Jochen", "Pat", "Frank")
    println("Names are $set")

    val mutableSet = mutableSetOf("Jochen", "Pat", "Frank")
    mutableSet.add("Haraldo")
    println("Names are $mutableSet")

    val map = mapOf("Jochwn" to 39, "Pat" to 29, "Frank" to 45)
    println("Names are $map")

    val mutableMap = mutableMapOf("Jochwn" to 39, "Pat" to 29, "Frank" to 45)
    mutableMap["Haralod"] = 7
    println("Names are $mutableMap")

}