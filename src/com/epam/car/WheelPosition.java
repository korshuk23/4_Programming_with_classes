package com.epam.car;

public enum WheelPosition {
    FRONT_RIGHT("Front right"),
    FRONT_LEFT("Front left"),
    REAR_RIGHT("Rear right"),
    REAR_LEFT("Rear left");
    private String type;

    WheelPosition(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
