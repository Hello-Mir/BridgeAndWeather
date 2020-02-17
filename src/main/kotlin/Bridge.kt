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
        stickList.forEach { it.isBrocken = randomGeneration()}
        return stickList
    }


    fun randomGeneration(): Boolean {
        var x = 1 + Random.nextInt(10)
        return if (listOf(1,2,3,4).contains(x)) {
            return true
        } else false
    }

    fun pathBuilder(someStickList: MutableList<Stick>): MutableList<Stick> {
       var startStick = someStickList[0]
        val readyToGo = mutableListOf<Stick>()
        for (f in someStickList){
            if(
                ((startStick.a.x == f.a.x || startStick.a.y == f.a.y) ||
                (startStick.b.x == f.b. x || startStick.b.y == f.b.y)) &&
                        !f.isBrocken)
                    {
                startStick = f
                readyToGo.add(startStick)

            }
        }
        return readyToGo
    }
//    сложить координаты балок имеющих связь с каждой из сторон
//    пройтись по всем балкам, начиная от той, которая имеет связь с одной стороной и работоспособна
//    проходя в цикле, находить работоспособную балку для каждой точки, запоминать свою позиицию, никогда не возваращаться к ней,
//    идти дальше до координаты противоположного берега
//    ??
    // вынести определение балок, относящихся к левому и правому берегу
    /*
    A(x,y) & B(x,y)

возможные значения типа x = {0...2}
возможные значения типа y = {0...3)

x x x
x y x
x c y y
x x x


1) собрать все балки, по которым можно пройти
пройтись от балки[0]
перебрать все балки рядом с текущей точкой.
Балка рядом = балка, по которой можно будет пройти. Не сломана И
A.x == B.x
A.y == B.y

when aliveAndOk = true
then currentStick = aliveAndOK

2) определить, можно ли по мосту пройти
среди списка балок, должны быть те, у которых
x = 0
или
x = 2

//поправить : результат "Coordiants(x=0.0, y=0.0),Coordiants(x=1.0, y=0.0),false"
     */
}





