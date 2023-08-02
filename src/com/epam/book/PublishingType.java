package com.epam.book;

public enum PublishingType {
    VLADOS("Vlados"),
    AST("Ast"),
    URSS_RU("URSS-ru"),
    GRAND_FAIR("Grand-fair"),
    INTELLIGENCE("Intelligence"),
    INFRA_M("Infra-m"),
    ONYX("Onyx"),
    PITER("Piter");
    private String type;

    PublishingType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
