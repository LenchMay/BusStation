/*
Автобусная станция
Представь, что у нас есть автобусная станция с большим разнообразным парком машин. У
каждого автобуса есть свои характеристики, такие как марка, год выпуска, количество
мест и т.д(можно добавить на свое усмотрение). Необходимо создать классы для
различных типов автобусов (например, городской автобус, междугородний автобус).
Необходимо определить общий интерфейс для всех типов автобусов

Классы для различных типов автобусов могут реализовывать этот интерфейс и иметь свои
уникальные методы и поля.

Нужно продемонстрировать работу созданных классов.

Необязательно
Продемонстрировать взаимозаменяемость разных типов автобусов. Например, создать
класс станции техобслуживания, которая принимает в себя объект общего типа для
автобусов.
 */
import classes.BusStop
import interfaces.Bus
import classes.CityBus
import classes.IntercityBus
import classes.ServiceStation

fun main(args: Array<String>) {
    val serviceStation = ServiceStation()
    val busStop = BusStop()

    val Ikarus: CityBus = CityBus("Ikarus", 1895)
    Ikarus.move()
    Ikarus.stop()
    busStop.changeNumOfPassengers(Ikarus, 50)
    serviceStation.serviceBus(Ikarus)

    val Irisbus: IntercityBus = IntercityBus("Irisbus", 2006)
    Irisbus.cityOne = "Москва"
    Irisbus.cityTwo = "Санкт-Петербург"
    Irisbus.move()
}

