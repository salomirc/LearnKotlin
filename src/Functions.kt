fun main() {

    forceChoke()
    makeAnEntrance("I find your lake of faith disturbing.")
    var rebels = calculateNumberGoodGuys(10, 12)

    // use of string template for variables
    println("The number of good guys is : $rebels")

    // use of string template for expressions
    println("The number of good guys is : ${calculateNumberGoodGuys(10, 12)}")

    println("Vader is feeling ${vaderIsFeeling()}.")
    println("Vader is feeling ${vaderIsFeeling("happy")}.")

}

fun forceChoke() {
    println("You have failed me for the last time Admiral ...")
}

fun makeAnEntrance(line: String) {
    println(line)
}

fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
    return rebels + ewoks
}

fun vaderIsFeeling(mood: String = "angry"): String {
    return mood
}