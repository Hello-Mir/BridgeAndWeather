fun main(){
    val test = Bridge(2, 3)
    val matrix = test.coordinatsCalculator(test)
 val someList = test.stickBuilder(matrix)
    val anotherList = test.stickRandomizer(someList)
    val aliveSticks = test.bridgeWorkAnalizer(anotherList)

//    for (i in anotherList){
//        print(i.xCoordiant)
//        print("," + i.yCoordinat)
//        println("," + i.isBrocken)
//    }
println(aliveSticks)

}