package com.epam.country;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private City capital;
    private final List<Region> regions;

    public Country(String name, String capital) {
        this.name = name;
        this.regions = new ArrayList<>();
        this.capital = new City(capital);
    }

    public void printCapital() {
        System.out.printf("The capital of %s is %s.\n", name, capital);
    }

    public void printNumberOfRegions() {
        System.out.printf("There are %d regions in %s.\n", this.regions.size(), name);
    }

    public void addRegions(Region... region) {
        regions.addAll(List.of(region));
    }

    public void removeRegion(RegionType regionName) {
        regions.removeIf(region -> regionName.equals(region.getName()));
    }

    public void printArea() {
        double area = 0;
        for (Region region : regions) {
            area += region.getArea();
        }
        System.out.printf("The area of %s is %.3f thousand square kilometers.\n", name, area);
    }

    public void printRegionalCenter() {
        System.out.printf("Regional centers of the %s: ", name);
        for (Region region : regions) {
            System.out.print(region.getName().getRegionType().replaceAll(" region", ", "));
        }
        System.out.println("\b\b.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }
}
