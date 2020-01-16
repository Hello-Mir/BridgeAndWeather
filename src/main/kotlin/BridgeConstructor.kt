fun main(){
    val test = Bridge(2, 3)
    val matrix = test.coordinatsCalculator(test)
// val someList = test.coordinatsCalculator(test)
    for (i in matrix){
        print(i.x)
        println("," + i.y)
    }
/*
 создать опору с 4 координатами a,b,c,d
 class Stick(matrix: Matrix, matrix: Matrix)

 создать матрицу точек
 каждая точка имеет x,y
 создать список опор, где у опоры две точки:
 fun list(matrix): someListofSticks{
 for(f in matrix.x) {
 for(d in matrix.d)
 }

 неправильно формируется матрица
 */
}