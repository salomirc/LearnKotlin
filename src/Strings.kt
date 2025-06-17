fun main() {

    //Kotlin has two types of string literals:
    // ESCAPED strings that may have escaped characters in them and
    // RAW strings that can contain newlines and arbitrary text

    var str = "May the force \nbe with you." // new line
    println(str)

    str = "May the force\t be with you." //tab
    println(str)

    str = "May the force\b be with you." //backspace
    println(str)

    str = "May the force \rbe with you." //carriage return
    println(str)

    str = "May the force \\be with you." //back slash
    println(str)

    str = "May the force \$be with you." //dollar sign
    println(str)

    str = "May the force \'be with you." //single quotes
    println(str)

    str = "My dad said : \"AAA\"\n" //double quotes
    println(str)

    str = "May the force be with you." // no escape characters

    //raw strings (multi line string):
    var rawCrawl = """A long time ago,
        |in a galaxy,
        |far, far, away ...
        |BUMM BUMM BUMM
        |
    """.trimMargin()
    println(rawCrawl)

    rawCrawl = """A long time ago,
        >in a galaxy,
        far, far, away ...
        BUMM BUMM BUMM
    """.trimMargin(">")
    println(rawCrawl)

//    for (chr in str) {
//        println(chr)
//    }

    var contentEquals: Boolean = str.contentEquals("May the force be with you.")
    println(contentEquals)

    var contains = str.contains("Force", true)
    println(contains)

    println(str.uppercase())
    println(str.lowercase())

    var num = 1000
    var stringNum = num.toString()
    println("num =  $num") //simple name in template
    println("stringNum =  $stringNum")
    println("stringNum : $stringNum has ${stringNum.length} characters.") //arbitrary expression in template

    var subsequence = str.subSequence(0, 7)
    println(subsequence)

}