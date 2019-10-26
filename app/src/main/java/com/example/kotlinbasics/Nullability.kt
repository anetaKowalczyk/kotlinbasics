package com.example.kotlinbasics

fun main(args: Array<String>) {

//    null check
    var nullableName: String? = "Do I really exist?"
    nullableName = null

    var lenght = 0
    if (nullableName != null) {
        lenght = nullableName.length
    } else {
        lenght = -1
    }

    println(lenght)

//safe call operator
    val l = if (nullableName != null) nullableName.length else -1

    println(nullableName?.length)


//elvis operator

    val len = nullableName?.length ?:-1
    val noName = nullableName ?: "No one knows me"

//    !! when we knows its deffinitely not null
//    println(nullableName!!.length)

}