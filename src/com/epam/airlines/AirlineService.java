package com.epam.airlines;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirlineService {
    private final List<Airline> airlines;

    public AirlineService(List<Airline> airlines) {
        this.airlines = new ArrayList<>(airlines);
    }

    public List<Airline> flightByDestination(String destination) {
        List<Airline> airlinesByDestination = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getDestination().equals(destination)) {
                airlinesByDestination.add(airline);
            }
        }
        return airlinesByDestination;
    }

    public List<Airline> flightByDayOfWeek(String dayOfWeek) {
        List<Airline> flightByDays = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getDaysOfWeek().getDay().equals(dayOfWeek)) {
                flightByDays.add(airline);
            }
        }
        return flightByDays;
    }

    public List<Airline> flightByDepartureTime(String dayOfWeek, String time) {
        List<Airline> flightByTime = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getDaysOfWeek().getDay().equals(dayOfWeek) &&
                    airline.getDepartureTime().isAfter(LocalTime.parse(time))) {
                flightByTime.add(airline);
            }
        }
        return flightByTime;
    }
}
