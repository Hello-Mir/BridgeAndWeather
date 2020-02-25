class Bridge(val length: Int, val width: Int) : Observer {
    var underThunder = false
    var passReady = false

    override fun update(thunderStrike: Boolean) {
        underThunder = thunderStrike
    }
}





