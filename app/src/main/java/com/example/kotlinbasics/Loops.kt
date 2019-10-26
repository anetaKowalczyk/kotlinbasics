package com.example.kotlinbasics


fun main(args: Array<String>) {

    val rebels = arrayListOf("Leia", "Luke", "Han Solo", " Mon Mothma")

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")


    for (rebel in rebels){
        println("Name: $rebel")
    }

    for((key, value) in rebelVehicles){
        println("$key gets around in their $value")
    }

    var x = 10

    while(x > 0){
        print(x)
        x--
    }

}