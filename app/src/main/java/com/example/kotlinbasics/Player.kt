package com.example.kotlinbasics

open class Player(val name: String, val age: String, val gender: String) {

    open fun attack(){
      println("For the king!")
    }

    fun defend(){

    }
}

class Thief(name: String, age: String, gender: String, skill: String) : Player(name, age, gender){

    override fun attack(){
       println("Die, scum!")
    }

}

fun main(args: Array<String>){

    val thadesuTheThief = Thief("Thadeus", "fifty", "male", "stealth")

    thadesuTheThief.attack()

}

