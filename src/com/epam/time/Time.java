package com.epam.time;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Time {
    private LocalTime localTime;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Time(String time) {
        try {
            this.localTime = LocalTime.parse(time, FORMATTER);
        } catch (DateTimeParseException e) {
            this.localTime = LocalTime.of(0, 0, 0);
            System.out.println("ERROR " + e.getMessage());
        }
    }

    public Time(int hours, int minutes, int seconds) {
        try {
            localTime = LocalTime.of(hours, minutes, seconds);
        } catch (DateTimeException e) {
            this.localTime = LocalTime.of(0, 0, 0);
            System.out.println("ERROR " + e.getMessage());
        }
    }

    public String plusHours(int hours) {
        localTime = localTime.plusHours(hours);
        return localTime.toString();
    }

    public String minusHours(int hours) {
        localTime = localTime.plusHours(hours);
        return localTime.toString();
    }

    public String plusMinutes(int minutes) {
        localTime = localTime.plusMinutes(minutes);
        return localTime.toString();
    }

    public String minusMinutes(int minutes) {
        localTime = localTime.minusMinutes(minutes);
        return localTime.toString();
    }

    public String plusSeconds(int seconds) {
        localTime = localTime.plusSeconds(seconds);
        return localTime.toString();
    }

    public String minusSeconds(int seconds) {
        localTime = localTime.minusSeconds(seconds);
        return localTime.toString();
    }

    public String getTime() {
        return this.localTime.format(FORMATTER);
    }

    public void setTime(String time) {
        try {
            this.localTime = LocalTime.parse(time, FORMATTER);
        } catch (DateTimeParseException e) {
            this.localTime = LocalTime.of(0, 0, 0);
            System.out.println("ERROR " + e.getMessage());
        }
    }

    public int getHours() {
        return localTime.getHour();
    }

    public int getMinutes() {
        return localTime.getMinute();
    }

    public int getSeconds() {
        return localTime.getSecond();
    }

    public void setHours(int hours) {
        try {
            this.localTime = LocalTime.of(hours, localTime.getMinute(), localTime.getSecond());
        } catch (DateTimeException | NullPointerException e) {
            System.out.println("ERROR " + e.getMessage());
        }
    }

    public void setMinutes(int minutes) {
        try {
            this.localTime = LocalTime.of(localTime.getHour(), minutes, localTime.getSecond());
        } catch (DateTimeException e) {
            System.out.println("ERROR " + e.getMessage());
        }
    }

    public void setSeconds(int seconds) {
        try {
            this.localTime = LocalTime.of(localTime.getHour(), localTime.getMinute(), seconds);
        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
