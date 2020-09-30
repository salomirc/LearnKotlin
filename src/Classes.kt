//class Car constructor(make: String, model: String) {
//    val make = make
//    val model = model
//}
//
//class Car(val make: String, val model: String, var color: String) {
//    fun accelerate(){
//        println("vroom vroom")
//    }
//
//    fun details() {
//        println("This is a $color $make $model")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int) {
//    fun tow() {
//        println("taking the horses to the rodeo")
//    }
//
//    fun details() {
//        println("The $make $model has a towing capacity of $towingCapacity lbs")
//    }
//}

open class Vehicle(val make: String, val model: String){

    var name: String = "Ciprian"

    val nameLength: Int
        get() = name.length

    var age: Int = 0
        get() {
            return field * 2
        }
        set(value) {
            field = value * 3
        }

    open fun accelerate(){
        println("vroom vroom")
    }

    fun park(){
        println("parking the vehicle")
    }

    fun brake(){
        println("STOP")
    }

    fun getMyAge(): Int{
        return age
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        //super.accelerate()
        println("We are going ludicrous mode!")
    }
}

class Truck(make: String, model: String, var towingCapacity: Int) : Vehicle(make, model) {
    private fun tow() {
        println("Headed out to the mountains.")
    }
}

class SuperTruck(make: String, model: String, var towingCapacity: Int) : Vehicle(make, model)

open class User {
    init {
        println("UserClass Init block")
    }
    val name: String

    constructor(name: String) {
        this.name = name
        println("UserClass SecondaryConstructorOne name = $name")
    }

    constructor(name: String, age: Int) {
        this.name = name
        println("Constructor name, age")
    }
}

class Student : User {
    init {
        println("StudentClass Init block, name = $name")
    }

    constructor(name: String) : super(name) {
        println("StudentClass SecondaryConstructorOne name = $name")
    }

    constructor(name: String, age: Int) : super(name, age) {
        println("Constructor name, age")
    }
}

fun main() {

    val carDemo = CarDemo("Ford", "Fiesta")
    println("The CarDemo brand is \"${carDemo.brand}\".")
    println("The CarDemo model can not be displayed because is private.")
//    val car = Car("Toyota", "Aygo", "red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
    val truck = Truck("Ford", "F-150", 1000)
    //truck.tow()
    truck.accelerate()
    //truck.tow()

    val tesla = Car("Tesla", "Model S", "Red")
    tesla.accelerate()
    tesla.park()
    tesla.brake()

    val myStudent = Student("Ciprian")

}