package classes

import interfaces.Bus

class BusStop {
    fun changeNumOfPassengers(bus: Bus, numOfPassangers: Int){
        bus.numOfPassengers = numOfPassangers
        println("Количество пассажиров в атобусе ${bus.model}: ${bus.numOfPassengers}")
    }
}