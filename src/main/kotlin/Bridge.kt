import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

class Bridge(private val length: Int, private val width: Int) : Observer {
    var gotThunder = false
    var passReady = false

    override fun update(thunderStrike: Boolean) {
        gotThunder = thunderStrike
    }

    fun coordinatsCalculator(someBridge: Bridge): MutableList<Stick.Coordiants> {
        val listOfCordinats = mutableListOf<Stick.Coordiants>()
        for (stickX in 0..someBridge.length) {
            for (stickY in 0..someBridge.width) {
                listOfCordinats.add(
                    Stick.Coordiants(stickX.toDouble(), stickY.toDouble())
                )
            }
        }
        return listOfCordinats
    }

    fun stickBuilder(coordiants: MutableList<Stick.Coordiants>): MutableList<Stick> {
        val stickList = mutableListOf<Stick>()

        coordiants.forEach { xCoordiant ->
            coordiants.forEach { yCoordinat ->
                if (sqrt((xCoordiant.x - yCoordinat.x).pow(2) + (xCoordiant.y - yCoordinat.y).pow(2)) <= 1.1 &&
                    xCoordiant != yCoordinat
                ) {
                    val element = Stick(xCoordiant, yCoordinat)
                    if (!stickList.contains(Stick(element.yCoordinat, element.xCoordiant))) {
                        stickList.add(element)
                    }
                }
            }
        }
        return stickList
    }


    fun randomGeneration(): Boolean {
        return if (1 + Random.nextInt(2) == 2) {
            return true
        } else false
    }

    fun stickRandomizer(someStickList: MutableList<Stick>): MutableList<Stick> {
        someStickList.forEach {
            it.isBrocken = randomGeneration()
        }
        someStickList.removeIf { it.isBrocken }
        return someStickList
    }

}



