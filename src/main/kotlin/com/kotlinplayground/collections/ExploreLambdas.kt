package com.kotlinplayground.collections

fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int) : Int {
    return op(x, y)
}

fun main() {

    val addLambda = { x: Int -> x + x}
    val addResult = addLambda(3)
    println("Result is $addResult")

    val multiplyLambda = {x: Int, y: Int ->
        println("x is $x and y is $y")
        x * y}

    val multiplyResult = multiplyLambda(2,3)
    println("Result is $multiplyResult")

    val result = calculate(2,3, {a,b -> a * b})
    println("The result is $result")
}