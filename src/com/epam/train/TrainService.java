package com.epam.train;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*
 * Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте  возможность  сортировки  массива  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
 * назначения должны быть упорядочены по времени отправления.
 */

public class TrainService {
    private final List<Train> trains;

    public TrainService(List<Train> trains) {
        this.trains = new ArrayList<>(trains);
    }

    public void sortByTrainNumber() {
        trains.stream()
                .sorted(Comparator.comparing(Train::getTrainNumber))
                .forEach(System.out::println);
    }

    public void sortByDestinationAndTime() {
        trains.stream()
                .sorted(Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime))
                .forEach(System.out::println);
    }

    public void getTrainByNumber(String trainNumber) {
        trains.stream()
                .filter(train -> train.getTrainNumber().equalsIgnoreCase(trainNumber))
                .forEach(System.out::println);
    }
}
