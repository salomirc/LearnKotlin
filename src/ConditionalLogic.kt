fun main() {

    var a = 2
    var b = 2

    if (a == b) {
        println("A does in fact equal B")
    }

    b = 3

    if (a != b) {
        println("A does NOT equal B")
    }

    var accountBalance = 100
    var price = 50

    if (accountBalance >= price) {
        println("You can buy this!")
    }
    else
    {
        println("Sorry, you broke!")
    }

    var degrees = 60
    if (degrees >= 70) {
        println("This is some nice weather.")
    }
    else if (degrees >=50 && degrees < 70) {
        println("Grab a Sweater!")
    }
    else {
        println("Holy crap its cold! ")
    }

    var isHungry = false
    var isBored = true

    if (isHungry || isBored) {
        println("Let's get pizza!")
    }

    var x = 3

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x does not equal 1 or 2")
    }

    val mood = "angry"
    vaderIsFeeling2(mood)

    // In Kotlin, if is an expression, i.e. it returns a value.
    // Therefore there is no ternary operator (condition ? then : else)
    // because ordinary if works fine in this role.

    // As expression
    val max = if (a > b) a else b
    println("\"a\" = $a")
    println("\"b\" = $b")
    println("Max value for \"a\" and \"b\" is $max")


}

fun vaderIsFeeling2(mood: String = "angry") {
    if (mood == "angry")
        println("run for the hills, Vader is $mood")
    else
        println("whatever you do, don't make him angry")
}