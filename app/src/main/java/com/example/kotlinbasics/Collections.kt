package com.example.kotlinbasics

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

    //inmutable - can't be changed
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Luke"))

    println(imperials)

//mutable - can be changed
    val rebels = arrayListOf("Leia", "Luke", "Han Solo", " Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)

    rebels.remove("Han Solo")
    println(rebels)

//inmutable
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leia", "This ship doesnt exists"))

//    mutable
    val rebelVehicles =
        hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Ship")
    rebelVehicles.put("Leia", " Tantive IV")
    rebelVehicles.remove("Boba Fett")
    rebelVehicles.clear()
    println(rebelVehicles)
    rebelVehicles.isEmpty()

}