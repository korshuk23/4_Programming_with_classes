package com.epam.travelvouchers;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<TourPackage> tours = new ArrayList<>();

        tours.add(new TourPackage("Spain", "Barcelona", TourType.CRUISE,
                TransportType.SHIP, FoodType.BREAKFAST, 12, 1099.99));
        tours.add(new TourPackage("Spain", "Salou", TourType.RECREATION,
                TransportType.PLANE, FoodType.ALL_INCLUSIVE, 14, 1699.89));
        tours.add(new TourPackage("Spain", "Madrid", TourType.EXCURSION,
                TransportType.BUS, FoodType.NOT_ALL_INCLUSIVE, 5, 400.10));
        tours.add(new TourPackage("Spain", "Malaga", TourType.RECREATION,
                TransportType.PLANE, FoodType.BREAKFAST, 15, 1400.20));
        tours.add(new TourPackage("Spain", "Barcelona", TourType.TREATMENT,
                TransportType.BUS, FoodType.NOT_ALL_INCLUSIVE, 8, 500.80));
        tours.add(new TourPackage("Italy", "Rome", TourType.EXCURSION,
                TransportType.PLANE, FoodType.ALL_INCLUSIVE, 10, 950.36));
        tours.add(new TourPackage("Italy", "Venice", TourType.CRUISE,
                TransportType.SHIP, FoodType.BREAKFAST, 20, 1099.91));
        tours.add(new TourPackage("Italy", "Milan", TourType.SHOPPING,
                TransportType.PLANE, FoodType.BREAKFAST, 3, 399.99));
        tours.add(new TourPackage("Italy", "Florence", TourType.TREATMENT,
                TransportType.TRAIN, FoodType.ALL_INCLUSIVE, 13, 1099.11));
        tours.add(new TourPackage("Italy", "Rome", TourType.SHOPPING,
                TransportType.CAR, FoodType.NOT_ALL_INCLUSIVE, 7, 599.50));

        Client client = new Client("George", "Leontiev", 500.20);
        TourService tourService = new TourService("Top Tours 2023", tours);

        System.out.println("Select by excursion:");
        ArrayList<TourPackage> tourByType = tourService.selectByOptions(TourType.EXCURSION);
        TourService.printTours(tourByType);

        System.out.println("\nSelect by ship:");
        ArrayList<TourPackage> tourByOption = tourService.selectByOptions(TransportType.SHIP);
        TourService.sortByDays(tourByOption);
        TourService.printTours(tourByOption);

        System.out.println("\nSelect by plane and breakfast:");
        tourByOption = tourService.selectByOptions(TransportType.PLANE, FoodType.BREAKFAST);
        TourService.sortByPrice(tourByOption);
        TourService.printTours(tourByOption);

        System.out.println("\nSelect by bus, all inclusive and for 7 days:");
        tourByOption = tourService.selectByOptions(TransportType.BUS, FoodType.ALL_INCLUSIVE, 7);
        TourService.sortByPrice(tourByOption);
        TourService.printTours(tourByOption);

        System.out.println("\nSelect by bus, not all inclusive and for 8 days:");
        tourByOption = tourService.selectByOptions(TransportType.BUS, FoodType.NOT_ALL_INCLUSIVE, 8);
        TourService.sortByPrice(tourByOption);
        TourService.printTours(tourByOption);

        System.out.println("\nSelect for 7 days:");
        tourByOption = tourService.selectByOptions(7);
        TourService.sortByPrice(tourByOption);
        TourService.printTours(tourByOption);

        tourService.addClient(client, tourByOption.get(0));
    }
}
