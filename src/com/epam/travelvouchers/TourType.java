package com.epam.travelvouchers;

public enum TourType {
    EXCURSION("Excursion"),
    CRUISE("Cruise"),
    SHOPPING("Shopping"),
    RECREATION("Recreation"),
    TREATMENT("Treatment");
    private String type;

    TourType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
