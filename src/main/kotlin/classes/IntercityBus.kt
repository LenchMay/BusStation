package classes

import interfaces.Bus

class IntercityBus(override val model: String, override val year: Int) : Bus {
    var cityOne: String = ""
    var cityTwo: String = ""
    override val speed = 100
    override var numOfPassengers = 0
    override fun move() {
        println("Междугородний автобус $model едет со скоростью $speed км/ч " +
                "от города $cityOne до города $cityTwo")
    }
}