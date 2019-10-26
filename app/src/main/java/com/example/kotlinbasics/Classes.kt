package com.example.kotlinbasics

//need to be open to be able to inherit from them
open class Vehicle(val make: String, val model: String) {

    open fun accelerate() {
        println("vroom vroom")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("stop")
    }


}

//need to pass the same parameters as the parent class
class Car(make: String, model: String, val color: String) : Vehicle(make, model) {

    override fun accelerate() {
    println("We are going ludicrous mode!")
    }

}

class Truck(make: String, model: String, val towingCap: Int) : Vehicle(make, model) {


}


fun main(args: Array<String>) {

    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 10000)

//    val car = Car("Toyota", "Avalon", "red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//    val truck = Truck("ford", "F-150", 10000)
//    truck.tow()

}


//class Car (val make: String, val model: String, val color: String){
//
//    fun accelerate(){
//        println("brum brum")
//    }
//
//
//    fun details(){
//        println("this is a $color $make $model")
//    }
//}
//class Truck(val make: String, val model: String, val towingCapacity: Int){
//    fun tow(){
//        println("taking the horses to the rodeo")
//    }
//}

