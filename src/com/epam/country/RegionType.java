package com.epam.country;

public enum RegionType {
    MINSK_REGION("Minsk region"),
    MOGILEV_REGION("Mogilev region"),
    GOMEL_REGION("Gomel region"),
    BREST_REGION("Brest region"),
    GRODNO_REGION("Grodno region"),
    VITEBSK_REGION("Vitebsk region");

    private String regionType;

    RegionType(String regionType) {
        this.regionType = regionType;
    }

    public String getRegionType() {
        return regionType;
    }

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }
}
