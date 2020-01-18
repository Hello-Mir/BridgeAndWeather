data class Stick(
    val xCoordiant: Coordiants,
    val yCoordinat: Coordiants
) {
    private var isBrocken = false


    data class Coordiants(var x: Double, var y: Double)

}


