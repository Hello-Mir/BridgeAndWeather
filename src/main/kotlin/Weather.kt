import kotlin.random.Random

class Weather : Subject {
    private val list: MutableList<Observer> = mutableListOf()

    override fun deleteObserver(observer: Observer) {
        list.remove(observer)
    }

    override fun reserveObserver(observer: Observer) {
        list.add(observer)
    }

    fun getThunder(someBridge: Bridge) {
        if (someBridge.randomGeneration()) {
            someBridge.update(true)
        } else {
            someBridge.update(false)
        }
    }



}