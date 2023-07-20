package com.epam.time;

public class TimeRunner {
    public static void main(String[] args) {
        Time localTime = new Time("10:10:10");
        System.out.println(localTime.getTime());
        localTime.setHours(-1);
        System.out.println(localTime.getTime());
        System.out.println(localTime.plusMinutes(2));
        System.out.println(localTime.plusHours(2));
    }
}
