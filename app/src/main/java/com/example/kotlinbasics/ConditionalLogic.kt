package com.example.kotlinbasics

fun main(args: Array<String>) {

    val a = 2
    val b = 3

    if (a == b) {
        println("A does in fact equal B")
    }

    if (a != b) {
        println("A does not equal B")
    }

    val accountBalance = 100
    val price = 50

    if (accountBalance >= price) {
        println("You can buy this!")
    } else {
        println("Sorry, you broke!")
    }

    val degrees = 70

    if (degrees >= 70) {
        println("This is some nice weather")
    } else if (degrees < 70 && degrees >= 50) {
        println("Grab a sweater")
    } else {
        println("Holy crap its cold!")
    }

    val isHungry = false
    val isBored = true

    if (isHungry == true || isBored == true) {
        println("Lets get pizza!")
    }

//    same = porownuje czy jest true
    if (isHungry || isBored) {
        println("Lets get pizza!")
    }

    val x = 1

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x does not equal 1 or 2")
    }
}