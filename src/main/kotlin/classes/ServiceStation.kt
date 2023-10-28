package classes
import interfaces.Bus

class ServiceStation {
    fun serviceBus(bus: Bus) {
        println("Техобслуживание ${bus.model}")
    }
}