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
                    Stick.Coordiants(stickX.toDouble(),stickY.toDouble())
                )
            }
        }
        return listOfCordinats
    }

    fun stickBuilder(coordiants: MutableList <Stick.Coordiants>): MutableList<Stick> {
        val stickList = mutableListOf<Stick>()

           coordiants.forEach {
               i ->
               coordiants.forEach {
                   j ->
                   if(sqrt((i.x - j.x).pow(2) + (i.y - j.y).pow(2)) <=1.1 && i!= j){
                       val element = Stick(xCoordiant = i,yCoordinat = j,hasCrack = false)
                       if(!stickList.contains(Stick(element.xCoordiant,element.xCoordiant,randomGeneration()))){

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

}



