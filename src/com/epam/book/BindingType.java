package com.epam.book;

public enum BindingType {
    SOFT("Soft"),
    SOLID("Solid");
    private String type;

    BindingType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
