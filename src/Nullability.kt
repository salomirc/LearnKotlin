fun main() {
    var name: String? = "Jonny B"
    println("The variable \"name\" value is \"$name\"")
    name = null
    println("The variable \"name\" value is \"$name\"")

    //Null check
    var nullableName: String? = "Do I really exist?"
    nullableName = null

    //First method If-Else statement
    val l = if (nullableName != null) nullableName.length else -1

    //Second method Safe Call Operator
    println(nullableName?.length)

    //Third method is Elvis Operator
    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me..."

    println(len)
    println(noName)

    //!! Let's crash our app
    //println(nullableName!!.length)
}