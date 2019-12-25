import kotlin.random.Random

class Bridge (val someWidth: Int, val someLength: Int) : Observer {
    private val width: Int = 0
    private val lenght: Int = 0
    private var gotThunder: Boolean = false

    override fun update(thunderStrike: Boolean) {
        gotThunder = thunderStrike
    }

    fun randomGeneration():Int{
        return 1+ Random.nextInt(2)
    }
}