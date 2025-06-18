package files_io_essentials

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

fun main() {

    val countFile = File("./src/files_io_essentials/demo/count.txt")

    //READ
    // Safe use of FileInputStream with low level method read() byte value

    // Inefficient low level read
    val stringBuilder = StringBuilder()
    val time1 = measureTimeMillis {
        FileInputStream(countFile).use { stream ->
            var byte = stream.read()
            while (byte != -1) {
                stringBuilder.append(byte.toChar())
                byte = stream.read()
            }
        }
    }

    // Efficient low level read with the help of bufferedReader
    // Recommended for very large files processing byte by byte
    val time2 = measureTimeMillis {
        FileInputStream(countFile).bufferedReader().use { reader ->
            var byte = reader.read()
            while (byte != -1) {
                stringBuilder.append(byte.toChar())
                byte = reader.read()
            }
        }
    }

    println("READ:")
    //Time1: 13440 ms
    println("Time1: $time1 ms")
    //Time2: 104 ms
    println("Time2: $time2 ms")



    //WRITE
    // Safe use of FileOutputStream with method write() byte

    // Inefficient low level write
    val time3 = measureTimeMillis {
        FileOutputStream(countFile).use { outputStream ->
            repeat(1000000) { integer ->
                outputStream.write("$integer\n".encodeToByteArray())
            }
        }
    }

    // Efficient low level write with the help of bufferedWriter
    // Recommended for very large files processing byte by byte
    val time4 = measureTimeMillis {
        FileOutputStream(countFile).bufferedWriter().use { writer ->
            repeat(1000000) { integer ->
                writer.write("$integer\n")
            }
        }
    }

    println("WRITE:")
    //Time3: 2681 ms
    println("Time3: $time3 ms")
    //Time4: 87 ms
    println("Time4: $time4 ms")
}