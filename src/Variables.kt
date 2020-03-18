fun main() {

    val name: String = "JonnyB"

    var isAwesome = true
    isAwesome = false

    println("Is " + name + " awesome ? The answer is : " + isAwesome)

    var a = 3

    var b = 6
    println(a + b)

    val myByteMaxValue: Byte = Byte.MAX_VALUE
    val myByteMinValue: Byte = Byte.MIN_VALUE
    val myDouble: Double = 123.345
    println(myDouble)
    val doubleNum: Double = 123.45 //64 bit number
    val myDoubleNum: Double = 123.453
    val floatNum: Float = 123.45f //32 bit
    val longNum: Long = 1234365476235467235L //64 bit

    val aDouble: Double = a.toDouble()
    var aFloat: Float = a.toFloat()

    var hero: String
//    hero = "batman"
//    hero = "superman"
//
//    println(hero)
    println("a Int = $a")
    println("aFloat = $aFloat")
    println("Byte minValue = $myByteMinValue")
    println("Byte maxValue = $myByteMaxValue")

    val number1: Int = 545344
    val number2: Byte = number1.toByte()
    println("number1 = $number1")
    println("number2 = $number2")
}