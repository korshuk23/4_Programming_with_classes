package com.epam.train;

public class Train {
    private String destination;
    private String trainNumber;
    private String departureTime;

    public Train(String destination, String trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime='" + departureTime + "\n";
    }
}
