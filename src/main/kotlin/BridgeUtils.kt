import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

class BridgeUtils {

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

        coordiants.forEach { a ->
            coordiants.forEach { b ->
                if (sqrt((a.x - b.x).pow(2) + (a.y - b.y).pow(2)) <= 1.1 &&
                    a != b
                ) {
                    val element = Stick(a, b)
                    if (!stickList.contains(Stick(element.b, element.a))) {
                        stickList.add(element)
                    }
                }
            }
        }
        stickList.forEach { it.isBrocken = randomGeneration() }
        return stickList
    }

    fun randomGeneration(): Boolean {
        var x = 1 + Random.nextInt(10)
        return if (listOf(1, 2, 3, 4).contains(x)) {
            return true
        } else false
    }

    fun pathBuilder(someStickList: MutableList<Stick>): MutableList<Stick> {
        var startStick = someStickList[0]
        val readyToGo = mutableListOf<Stick>()
        for (f in someStickList) {
            if (
                ((startStick.a.x == f.a.x || startStick.a.y == f.a.y) ||
                        (startStick.b.x == f.b.x || startStick.b.y == f.b.y)) &&
                !f.isBrocken
            ) {
                startStick = f
                readyToGo.add(startStick)
            }
        }
        return readyToGo
    }

    fun isWorks(xBridge: Bridge): Boolean{
        val bridgeSet = BridgeUtils()
        val matrix = bridgeSet.coordinatsCalculator(xBridge)
        val someList = bridgeSet.stickBuilder(matrix)
        val anotherList = bridgeSet.pathBuilder(someList)

        return xBridge.passReady
    }
}

/*
без Дийкстры не обойтись.
Потому что нельзя сделать список связанных балок и потом получить те, что связан с берегом.
Те что связаны с берегом могут быть оторваны ? Нужен еще тест

 */