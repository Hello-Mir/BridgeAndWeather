fun main(){
    val test = Bridge(2, 3)
//    print(test.randomGeneration())
    val someSticks = test.stickCoordinatsCalculator(test)
    println(someSticks.get(1).xLocation)


}