package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = {c: Course -> c.category == CourseCategory.DEVELOPEMENT}

    exploreFilter(courseList, devPredicate)
}

fun exploreFilter(courseList: MutableList<Course>,
    predicate: (Course) -> Boolean) {

    val developmentCourses = courseList
        .filter{predicate.invoke(it)}
        .forEach{
            println("DevCourses: $it")
        }
}
