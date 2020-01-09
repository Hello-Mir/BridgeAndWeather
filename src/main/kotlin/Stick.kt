class Stick(var xLocation: Int, var yLocation: Int, var hasCrack: Boolean){
    private var isBrocken = false


    fun checkHealthOfSticks(bridge: Bridge){
        if(bridge.gotThunder) {
          val stickList = bridge.stickCoordinatsCalculator(bridge)

        }
    }
}