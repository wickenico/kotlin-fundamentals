fun main() {

//    val range = 1..10
//
//    for (i in range) {
//        println("i : $i")
//    }
//
//    val reverseRange = 10 downTo 1
//
//    for (i in reverseRange) {
//        println("reverse : $i")
//    }
//
//    for (i in reverseRange step 2) {
//        println("reverse with Skip : $i")
//    }

    exploreWhile()
    exploreDoWhile()

}

fun exploreDoWhile() {
    var i = 0
    do {
        println("Value i: $i")
        i++
    } while (i < 5)
}

fun exploreWhile() {

    var x = 1

    while (x < 5) {
        println("Value: $x")
        x++
    }
}
