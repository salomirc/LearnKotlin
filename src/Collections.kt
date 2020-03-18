fun main() {

    // immutable list
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials)
    println(imperials.sorted())
    println(imperials.sortedByDescending { e -> e })
    println(imperials[1])
    println(imperials.first())
    println(imperials.last())
    println(imperials.contains("Emperor"))

    // mutable list
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.remove("Han Solo")
    println(rebels)
    rebels.removeAt(rebels.size - 1)
    println(rebels)

    // error variable can not be reassigned
    //rebels = arrayListOf("aaa", "bbb")

    //immutable maps
    val rebelVehiculesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "LandSpeeder")
    val map2 = mapOf<String, Int>(
        "Solo" to 10,
        "Vader" to 11
    )
    val map3 = mapOf("Solo" to "Falcon")

    println(rebelVehiculesMap["Solo"])
    println(rebelVehiculesMap.get("Solo"))
    println(rebelVehiculesMap.getOrDefault("Vader", "This key does not exist."))
    println(rebelVehiculesMap.keys)
    println(rebelVehiculesMap.values)


    //mutable maps
    val rebelVehicules = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "LandSpeeder", "Boba Fett" to "Rachet")
    rebelVehicules["Luke"] = "XWing"
    rebelVehicules.put("Leiah","Tantive IV")
    println(rebelVehicules)
    rebelVehicules.remove("Boba Fett")
    println(rebelVehicules)
    rebelVehicules.clear()
    println(rebelVehicules)
    println("rebelVehicle isEmpty = ${rebelVehicules.isEmpty()}")




}