package classes
import interfaces.Bus

class CityBus(override val model: String, override val year: Int) : Bus {
    override var numOfPassengers = 0
    override val speed = 60;
    override fun move() {
        println("Городской автобус $model едет со скоростью $speed км/ч")
    }

    override fun stop() {
        println("Городской автобус $model остановился")
    }
}