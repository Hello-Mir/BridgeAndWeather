interface Subject {
    fun reserveObserver(observer: Observer)
    fun deleteObserver(observer: Observer)
}