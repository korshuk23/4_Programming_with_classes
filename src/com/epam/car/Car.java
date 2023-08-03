package com.epam.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private final List<Wheel> wheels;
    private boolean isFuel;
    private int count = 0;

    public Car(String model, int horsePower, double volume) {
        this.model = model;
        this.engine = new Engine(horsePower, volume);
        this.wheels = new ArrayList<>();
        this.isFuel = true;
    }

    public void drive() {
        if (wheels.size() == 4 && isFuel && engine.isHasEngine()) {
            System.out.println("The car is run.");
        }
        if (wheels.size() < 4) {
            System.out.println("Please add wheels to run the car.");
        }
        if (!isFuel) {
            System.out.println("Please, fill the car tank.");
        }
        if (!engine.isHasEngine()) {
            System.out.println("Please, install the engine in hte car.");
        }
    }

    public void refueled() {
        this.isFuel = true;
        System.out.println("Car is fuel.");
    }

    public void setWheels(Wheel... wheels) {
        if (count < 4) {
            System.out.printf("%d wheel(s) are installed.\n", wheels.length);
            this.wheels.addAll(Arrays.asList(wheels));
            count = wheels.length + 1;
        } else {
            System.out.println("Count of wheels is more than 4!");
        }
    }

    public void changeWheel(WheelPosition wheelPosition, Wheel wheelToChange) {
        for (int i = 0; i < wheels.size(); i++) {
            if (wheels.get(i).getPosition().equals(wheelPosition)) {
                wheels.set(i, wheelToChange);
                System.out.printf("Wheel (%s) is changed.\n",
                        wheelPosition.getType());
            }
        }
    }

    public void printWheels() {
        for (Wheel wheel : wheels) {
            System.out.printf("%s\n", wheel);
        }
    }


    public String getModel() {
        return "Car model: " + model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(int horsePower, double volume) {
        this.engine = new Engine(horsePower, volume);
    }
}
