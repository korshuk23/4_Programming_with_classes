package com.epam.travelvouchers;

public enum FoodType {
    NOT_ALL_INCLUSIVE("Not all inclusive"),
    BREAKFAST("Breakfast"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
    ALL_INCLUSIVE("All inclusive");
    private String type;

    FoodType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
