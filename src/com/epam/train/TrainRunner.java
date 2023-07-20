package com.epam.train;

import java.util.ArrayList;
import java.util.List;

public class TrainRunner {
    public static void main(String[] args) {
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("Moskow", "2", "12:30"));
        trains.add(new Train("Grodno", "1", "2:35"));
        trains.add(new Train("Vilnius", "4", "10:05"));
        trains.add(new Train("Vilnius", "3", "06:30"));
        trains.add(new Train("Vilnius", "5", "09:30"));

        TrainService.sortByTrainNumber(trains);
        TrainService.getTrainByNumber("3", trains);
        TrainService.sortByDestinationAndTime(trains);
    }
}
