package com.epam.counter;

public class CounterRunner {
    public static void main(String[] args) {
        Counter counter1 = new Counter(5, 0, 10);
        Counter counter2 = new Counter(6, 3, 5);
        Counter counter3 = new Counter(5, 2);

        System.out.println("Current:");
        System.out.println(counter1.getCurrent());
        System.out.println(counter2.getCurrent());
        System.out.println(counter3.getCurrent());
        System.out.println("----------------------");

        for (int i = 0; i < 2; ++i) {
            counter1.increment();
            counter2.increment();
            counter3.increment();
        }
        System.out.println("After Increment:");
        System.out.println(counter1.getCurrent());
        System.out.println(counter2.getCurrent());
        System.out.println(counter3.getCurrent());
        System.out.println("----------------------");

        for (int i = 0; i < 20; ++i) {
            counter1.decrement();
            counter2.decrement();
            counter3.decrement();
        }
        System.out.println(" After Decrement:");
        System.out.println(counter1.getCurrent());
        System.out.println(counter2.getCurrent());
        System.out.println(counter3.getCurrent());
        System.out.println("----------------------");
    }
}
