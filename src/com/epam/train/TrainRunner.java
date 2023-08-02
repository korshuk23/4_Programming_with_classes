package com.epam.train;

import java.util.ArrayList;
import java.util.List;

/*
 * Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте  возможность  сортировки  массива  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
 * назначения должны быть упорядочены по времени отправления.
 */
public class TrainRunner {
    public static void main(String[] args) {
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("Moskow", "2", "12:30"));
        trains.add(new Train("Grodno", "1", "2:35"));
        trains.add(new Train("Vilnius", "4", "10:05"));
        trains.add(new Train("Vilnius", "3", "06:30"));
        trains.add(new Train("Vilnius", "5", "09:30"));

        TrainService trainService = new TrainService(trains);
        trainService.sortByTrainNumber();
        System.out.println("----------------");
        trainService.getTrainByNumber("3");
        System.out.println("----------------");
        trainService.sortByDestinationAndTime();
    }
}
