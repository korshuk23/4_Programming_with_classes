package com.epam.country;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private final List<District> districts;

    public City(String name) {
        this.name = name;
        this.districts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(District... districts) {
        this.districts.addAll(List.of(districts));
    }

    @Override
    public String toString() {
        return name;
    }
}
