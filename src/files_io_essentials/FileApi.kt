package files_io_essentials

import java.io.File

fun main() {

    //Create File
    val folder = File("./src/files_io_essentials/demo")
    val file = File(folder, "hello.txt")

    if (!folder.exists()) {
        folder.mkdirs()
    }

    file.createNewFile()

    //Write Text
    if (file.length().toInt() == 0) {
        file.writeText("Hello world!")
    }
    file.writeText("Hello world again!")

    //List files
    val projectFolder = File(".")
    projectFolder.listFiles()?.forEach { file ->
        println(file.name)
    }
    repeat(30) { print("=") }
    println()

    //List files recursively
    val srcFolder = File("./src")
    printFilesRecursively(srcFolder)

}

fun printFilesRecursively(folder: File, indentationLevel: Int = 0) {
    folder.listFiles()?.forEach { child ->
        val symbol = if (child.isDirectory) "" else "-"
        val line = buildString {
            repeat(indentationLevel) {
                append("  ")
            }
            append("$symbol${child.name}")
        }
        println(line)

        if (child.isDirectory) {
            printFilesRecursively(child, (indentationLevel + 1))
        }
    }
}