package interfaces

interface Bus {
    val model: String
    val year: Int
    val speed: Int
    var numOfPassengers: Int

    fun move()
    fun stop() {
        println("Остановка")
    }
}
