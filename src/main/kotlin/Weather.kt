import kotlin.random.Random

class Weather : Subject {
    private val list: MutableList<Observer> = mutableListOf()

    override fun deleteObserver(observer: Observer) {
        list.remove(observer)
    }

    override fun reserveObserver(observer: Observer) {
        list.add(observer)
    }

    fun makeThunder(someBridge: Bridge) {
        if (randomThunder()) {
            someBridge.update(true)
        } else {
            someBridge.update(false)
        }
    }

    fun randomThunder(): Boolean {
        var x = 1 + Random.nextInt(2)
        return if (x ==1) {
            return true
        } else false
    }

}