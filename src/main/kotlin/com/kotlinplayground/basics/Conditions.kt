fun main() {

    val name = "Anita"
    val result = if(name.length == 4) {
      println("Name is four Characters.")
        name.length
    } else {
        println("Name ist not four Characters.")
        name.length
    }

    println("result: $result")

    var position = 1
    position = 2

//    val medal = if (position == 1) {
//        "GOLD"
//    } else if (position == 2) {
//        "SILVER"
//    } else if (position ==  3) {
//        "BRONZE"
//    } else {
//        "NO MEDAL"
//    }

    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println(medal)

}

