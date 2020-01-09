fun main(){
    val test = Bridge(2, 3)
//    print(test.randomGeneration())
    val someSticks = test.stickCoordinatsCalculator(test)
    for (stick in someSticks){
        print("; " + stick.xLocation)
        println(" ,"+ stick.yLocation)

    }



}