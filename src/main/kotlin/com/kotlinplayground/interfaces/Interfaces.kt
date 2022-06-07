package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {

    val isCoursePersisted: Boolean

    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("course: $course")
        return course.id
    }
}

class SqlCourseRepository: CourseRepository, Repository{
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Reactie Programm", "Nico Wickersheim")
    }

    override fun getAll(): Any {
        return 1
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

}

interface Repository {
    fun getAll(): Any
}

class NoSqlCourseRepository : CourseRepository{
    override val isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Reactie Programm", "Nico Wickersheim")
    }

    override fun save(course: Course): Int {
        println("course in NoSQlRepo: $course")
        return course.id
    }

}

interface A {
    fun doSomething() {
        println("do in A")
    }
}

interface B {
    fun doSomething() {
        println("do in B")
    }
}

class AB: A,B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSome in AB")
    }

}

fun main() {

    val sql = SqlCourseRepository()
    val course = sql.getById(1)
    println(course)
    val courseId = sql.save(Course(5, "Reactie Programm", "Nico Wickersheim"))
    println(courseId)
    println(sql.isCoursePersisted)

    val noSql = NoSqlCourseRepository()
    val course1 = noSql.getById(2)
    println(course1)
    val savedCourseId = noSql.save(Course(6, "Reactie Programm", "Nico Wickersheim"))
    println(savedCourseId)

    val ab = AB()
    ab.doSomething()

}