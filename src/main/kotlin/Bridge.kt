import kotlin.random.Random

class Bridge(private val length: Int, private val width: Int) : Observer {
    var gotThunder = false

    override fun update(thunderStrike: Boolean) {
        gotThunder = thunderStrike
    }



    fun stickCoordinatsCalculator(someBridge: Bridge): List<Stick> {
        val listOfSticks: MutableList<Stick> = mutableListOf()

        for (stickX in 0..someBridge.length) {
            for (stickY in 0..someBridge.width) {
                listOfSticks.add(Stick(
                    stickX, stickY, randomGeneration()
                ))
            }
        }
        return listOfSticks
    }

    fun randomGeneration(): Boolean {
        return if (1 + Random.nextInt(2) == 2) {
            return true
        } else false
    }

}



