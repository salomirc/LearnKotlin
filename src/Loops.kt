fun main() {

    val rebels = mutableListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")

    val rebelVehicles = mutableMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")

    for (rebel in rebels){
        println("Name: $rebel")
    }

    for (i in rebels.indices){
        if (i == rebels.indices.last)
        {
            rebels[i] = "Yoda"
        }
        println("rebels[$i] = ${rebels[i]}" )
    }

    for ((key, value) in rebelVehicles){
        println("$key gets around in their $value.")
    }

    var x = 10
    while (x > 0){
        println(x)
        x--
    }
}