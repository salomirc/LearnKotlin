package files_io_essentials

import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

fun main() {

    val textFile = File("./src/files_io_essentials/demo/hello.txt")
    val countFile = File("./src/files_io_essentials/demo/count.txt")
    val byteArrayFile = File("./src/files_io_essentials/demo/byte_array.txt")

    //READ

    // Unsafe use of FileInputStream with high level method readBytes()
    val inputStream = FileInputStream(textFile)
    val bytes = inputStream.readBytes()
    inputStream.close()
    println(bytes.decodeToString())

    // Recommended approach
    // Safe use of FileInputStream Try/Finally equivalent with close()
    // T must implement Closeable interface, see T.use() method source code
    FileInputStream(textFile).use {
        val bytes = it.readBytes()
        val text = bytes.decodeToString()
        println(bytes.toList().toString())
        println(text)
    }

    // Safe use of FileInputStream with low level method read() byte value
    val stringBuilder = StringBuilder()
    FileInputStream(textFile).use {
        var byte = it.read()
        while (byte != -1) {
            stringBuilder.append(byte.toChar())
            byte = it.read()
        }
    }
    println(stringBuilder.toString())


    //WRITE

    // Safe use of FileOutputStream with method write() byte
    FileOutputStream(countFile).use { outputStream ->
        repeat(1000) { integer ->
            outputStream.write("$integer\n".encodeToByteArray())
        }
    }

    // Safe use of FileOutputStream with method write() byteArray
    val text = "Hello"
    val byteArray = text.toByteArray(Charsets.UTF_8)
//    val byteArray = byteArrayOf(1, 2, 3, 4, 5)
    FileOutputStream(byteArrayFile).use { outputStream ->
        outputStream.write(byteArray)
    }


    // In memory data processing with ByteArrayOutputStream
    val myByteArray = ByteArrayOutputStream().use { outputStream ->
        val text = "Hello"
        val byteArray = text.toByteArray(Charsets.UTF_8)
        outputStream.write(byteArray)
        outputStream.toByteArray()
    }
}