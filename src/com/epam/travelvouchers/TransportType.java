package com.epam.travelvouchers;

public enum TransportType {
    CAR("Car"),
    BUS("Bus"),
    TRAIN("Train"),
    PLANE("Plane"),
    SHIP("Ship");

    private String type;

    TransportType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
