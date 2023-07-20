package com.epam.train;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TrainService {

    public static void sortByTrainNumber(List<Train> trains) {
        trains.sort(Comparator.comparing(Train::getTrainNumber));
        Stream.of(trains)
                .forEach(System.out::println);
    }

    public static void sortByDestinationAndTime(List<Train> trains) {
        trains.sort(Comparator.comparing(Train::getDestination)
                .thenComparing(Train::getDepartureTime));
        Stream.of(trains)
                .forEach(System.out::println);
    }

    public static void getTrainByNumber(String trainNumber, List<Train> trains) {
        trains.stream()
                .filter(train -> train.getTrainNumber().equalsIgnoreCase(trainNumber))
                .forEach(System.out::println);
    }
}
