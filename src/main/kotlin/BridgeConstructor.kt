fun main(){
    val test = Bridge(2, 3)
    val matrix = test.coordinatsCalculator(test)
 val someList = test.stickBuilder(matrix)
    val anotherList = test.pathBuilder(someList)


    for (i in anotherList){
        print(i.a)
        print("," + i.b)
        println("," + i.isBrocken)
    }

}