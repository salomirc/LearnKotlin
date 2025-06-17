package files_io_essentials

import java.io.File

fun main() {
    val folder = File("./src/files_io_essentials/demo")
    val file = File(folder, "hello.txt")

    if (!folder.exists()) {
        folder.mkdirs()
    }

    file.createNewFile()
    if (file.length().toInt() == 0) {
        file.writeText("Hello world!")
    }
    file.writeText("Hello world again!")
}