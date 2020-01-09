import kotlin.random.Random

class Bridge(val length: Int, val width: Int) : Observer {
    private var gotThunder: Boolean = false

    override fun update(thunderStrike: Boolean) {
        gotThunder = thunderStrike
    }

    fun randomGeneration(): Int {
        return 1 + Random.nextInt(2)
    }

    fun stickCoordinatsCalculator(someBridge: Bridge): List<Stick> {
//        val firstStick = Stick(0,0)
        val lastStick = Stick(someBridge.length, someBridge.width)
        val listOfSticks: MutableList<Stick> = mutableListOf()
//
//        var lastX = lastStick.xLocation
//        var lastY = lastStick.yLocation

        for (stickX in 0..someBridge.length) {
            for (stickY in 0..someBridge.width) {
                listOfSticks.add(Stick(stickX, stickY))
            }
        }
        return listOfSticks
    }
}



