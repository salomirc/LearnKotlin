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
        println("UserClass SecondaryConstructorTwo name = $name, age = $age")
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
        println("StudentClass SecondaryConstructorTwo name = $name, age = $age")
    }
}


interface Shape {
    val vertexCount: Int
}

//Default value is used only if no value is provided when calling the constructor
//Can have (any) vertices number accordingly to the value supplied as the constructor argument
class Rectangle(override val vertexCount: Int = 4) : Shape  // vertexCount can be set only in the constructor call
//Always has 4 vertices ?? Answer : NO! (Kotlin documentation)

class Polygon : Shape {
    override var vertexCount: Int = 0  // Can be set to any number later
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

    val defaultValueRectangle = Rectangle()
    val rectangle = Rectangle(10)
    val polygon = Polygon().apply { vertexCount = 9 }

    println("defaultValueRectangle vertexCount = ${defaultValueRectangle.vertexCount}")
    println("Rectangle vertexCount = ${rectangle.vertexCount}")
    println("Polygon vertexCount = ${polygon.vertexCount}")

}