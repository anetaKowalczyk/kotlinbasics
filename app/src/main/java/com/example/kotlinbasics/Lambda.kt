package com.example.kotlinbasics

fun main(args: Array<String>) {

    //lambda - on the left of arrow parameters, on the right body
    val printMessage = { message: String -> println(message) }

    printMessage("Hello world")

    val sumA = { x: Int, y: Int -> x + y }

    println(sumA(5, 2))

    //easier way to declare parameters, more tidy - they don't sit in lambda, they are in the type
    val sumB: (Int, Int) -> Int = { x, y -> x + y }


    //dummy download function
    fun downloadData(url: String, completion: () -> Unit) {
        //send a download request
//        we got back data
// then were no network errors
        completion()
    }

    downloadData("fakeurl.com", { println("the code in this block will run after the completion") })


    fun downloadCarData(url: String, completion: (Car) -> Unit) {
//        send a download request
//        we got back car data

        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)

//        downloadCarData("fakeurlp.com") { car ->
        println(car.color)
        println(car.make)
    }

//        only if I have one parameter to pass
    downloadCarData("fakeurlp.com") {
        println(it.color)
        println(it.make)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
//        make the web request
//        get results back
        val webRequestSuccess = false
        if (webRequestSuccess) {
//            receive truck data
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("facke.com") { truck, success ->
        if (success == true) {
        } else {
            println("Something went wrong")
        }
    }


}

