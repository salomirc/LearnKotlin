package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        withTimeout(1300L) {
            repeat(1000) { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        }
    }
    catch (e: TimeoutCancellationException){
        println("${e.message}")
    }
    finally {
        println("Running finally block.")
    }
}