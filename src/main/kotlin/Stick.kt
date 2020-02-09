data class Stick(
    val a: Coordiants,
    val b: Coordiants
) {
    var isBrocken = false

    data class Coordiants(var x: Double, var y: Double)
}


