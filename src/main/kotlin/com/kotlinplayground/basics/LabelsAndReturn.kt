fun main() {

    for (i in 1..5) {
        println("i in $i")
        if (i == 3) break
    }

    label()

    for (i in 1..5) {
        println("i return in $i")
        if (i == 3) return
    }

    println("End of Programm!")
}

fun label() {
    loop@ for (i in 1..5) {
        println("i in $i")
        // if (i == 3) break@loop

        innerloop@ for (j in 1..5) {
            println("j in $j")
            //if (j==2) break@innerloop
            if (j==2) continue@innerloop
        }
    }
}
