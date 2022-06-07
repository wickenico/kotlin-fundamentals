package com.kotlinplayground.classes

class Item() {

    var name : String = ""
    var price: Double = 0.0
    get(){
        println("Inside Getter")
        return field
    }

    set(value) {
        if(value> 0.0) {
            field = value
        } else {
            throw java.lang.IllegalArgumentException("Negative Price is not allowd")
        }
    }

    constructor(_name: String) : this() {
        name = _name
    }

}

fun main() {

    val item = Item("iPhone")
    println("Item name is ${item.name}")

    item.name = "Iphone 13"
    println("Item name is ${item.name}")

    item.price = 10.0

    println(item.price)

}