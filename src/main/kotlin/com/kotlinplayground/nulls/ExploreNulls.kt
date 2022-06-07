package com.kotlinplayground.nulls

data class Movie(
    val id: Int?,
    val name: String)


fun main() {

    var nameNullable: String? = null
    println("Value is ${nameNullable?.length}")

    nameNullable = "Dilldapp"
    println("Value is $nameNullable")

    var name: String? = null

    val movie = Movie(null, "Avengers")
    val savedMovie = saveMovie(movie)
    println("Saved movie is $savedMovie")

}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
}
