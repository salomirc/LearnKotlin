package coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) = runBlocking {

    val time = measureTimeMillis {
        val first = async { firstNumber() }
        val second = async { secondNumber() }
        val third = async { thirdNumber() }
        println("The answer is ${first.await() + second.await() + third.await()}")
    }

    println("Tasks execution time: $time") //prints 7 seconds
}
suspend fun firstNumber(): Int {
    delay(1000) // 3 seconds delay
    return 1
}
suspend fun secondNumber(): Int {
    delay(2000) // 5 seconds delay
    return 2
}
suspend fun thirdNumber(): Int {
    delay(3000) // 7 seconds delay
    return 3
}
//the above code prints out 7 seconds, which is the time it took the longest running function to return