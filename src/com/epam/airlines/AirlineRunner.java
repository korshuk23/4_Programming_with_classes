package com.epam.airlines;
/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конст рукторы, set- и get- методы
 * и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 *    Найти и вывести:
 *    a) список рейсов для заданного пункта назначения;
 *    b) список рейсов для заданного дня недели;
 *    c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirlineRunner {
    public static void main(String[] args) {
        List<Airline> airlines = new ArrayList<>();
        airlines.add(new Airline("Minsk-Moskow", 3, AircraftType.CHARTER_FLIGHT,
                LocalTime.parse("18:55"), DaysOfWeek.SATURDAY));
        airlines.add(new Airline("Berlin-Minsk", 2, AircraftType.CONNECTING_FLIGHT,
                LocalTime.parse("05:45"), DaysOfWeek.MONDAY));
        airlines.add(new Airline("Minsk-Riga", 1, AircraftType.CHARTER_FLIGHT,
                LocalTime.parse("08:32"), DaysOfWeek.MONDAY));
        airlines.add(new Airline("Warsaw-Minsk", 4, AircraftType.DIRECT_NON_SCHEDULED_FLIGHT,
                LocalTime.parse("15:15"), DaysOfWeek.TUESDAY));
        AirlineService service = new AirlineService(airlines);
        //taskA
        System.out.println(service.flightByDestination("Minsk-Moskow"));
        //taskB
        System.out.println(service.flightByDayOfWeek("Monday"));
        //taskC
        System.out.println(service.flightByDepartureTime("Monday", "05:46"));
    }
}
