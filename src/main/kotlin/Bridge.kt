import kotlin.random.Random

class Bridge(val width: Int, val length: Int) : Observer {
    //    private val localWidth: Int = 0
//    private val lenght: Int = 0
    private var gotThunder: Boolean = false

    override fun update(thunderStrike: Boolean) {
        gotThunder = thunderStrike
    }

    fun randomGeneration(): Int {
        return 1 + Random.nextInt(2)
    }

    fun stickCoordinatsCalculator(someBridge: Bridge): List<Stick> {
        val lastStick = Stick(someBridge.length, someBridge.width)
        val listOfSticks: MutableList<Stick> = mutableListOf(lastStick)
        var lastX = lastStick.xLocation
        var lastY = lastStick.yLocation


        for (stick in listOfSticks) {
            if (stick.xLocation > 0 && lastY > 0)
                listOfSticks.add(Stick(lastX, lastY))
            lastX -= 1
            lastY -= 1
        }
        return listOfSticks
/*
получать экземпляр моста
составить список опор с конкретными координатами
 */
    }
}