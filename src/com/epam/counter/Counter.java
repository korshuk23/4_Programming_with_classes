package com.epam.counter;

public class Counter {
    private int currentValue;
    private int minValue;
    private int maxValue;

    public Counter(int currentValue, int minValue, int maxValue) {
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;

        if (maxValue < minValue) {
            this.maxValue = minValue;
            this.minValue = maxValue;
        }

        if (this.currentValue < this.minValue) {
            this.currentValue = minValue;
        }
        if (this.currentValue > this.maxValue) {
            this.currentValue = maxValue;
        }
    }

    public Counter(int minValue, int maxValue) {
        this(minValue, minValue, maxValue);
    }

    public Counter() {
        this(0, 0, 16);
    }

    public void increment() {
        if (currentValue < maxValue) {
            currentValue++;
        }
    }

    public void decrement() {
        if (currentValue > minValue) {
            currentValue--;
        }
    }

    public int getCurrent() {
        return currentValue;
    }
}
