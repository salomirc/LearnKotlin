fun main() {

    val printMessage = { message: String -> println(message)}
    printMessage("AAA")

    // type by inference
    val sumA = { x: Int, y: Int -> x + y}
    println(sumA(10, 18))

    // explicit type
    val sumB : (Int, Int) -> Int = {x, y -> x + y}
    println(sumB(10, 19))

    //call downloadDataFunction
    //downloadData("fakeUrl.com", { println("The code in this block will only run after the completion()") })

    //There is a convention, if last param is a lambda then you can move it into {}
    downloadData("fakeUrl.com") {
        println("The code in this block will only run after the completion()")
    }

    //Preferred mode
    downloadCarData("fakeUrl.com"){car ->
        println(car.color)
        println(car.make)
        println(car.model)
    }

    //Convention : if only one param in lambda can replace it with "it"
//    downloadCarData("fakeUrl.com"){
//        println(it.color)
//        println(it.make)
//    }

    downloadTruckData("fakeUrl"){ truck, success ->
        run {
            if (success) {
                //do something with our truck
                truck?.accelerate()
            } else {
                // handle the web request failure
                println("Something went wrong!")
            }
        }

    }
}

fun downloadData(url: String, completion: () -> Unit) {
    //sent a download request
    //we got back data
    //there is no network errors
    completion()
}

fun downloadCarData(url: String, completion: (Car) -> Unit){
    // send a download request
    val car = Car("Tesla", "ModelX", "Blue")
    completion(car)
}

fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit){
    //make the web request
    //we get the results back

    val webRequestSuccess = true
    if (webRequestSuccess){
        //receive track data
        val truck = Truck("Ford", "F-150", 1000)
        completion(truck, true)
    } else {
        completion(null, false)
    }
}