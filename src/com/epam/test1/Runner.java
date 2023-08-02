package com.epam.test1;

public class Runner {
    public static void main(String[] args) {
        Test1 test1 = new Test1(1, 2);
        test1.print();
        test1.setA(2);
        test1.setB(3);
        System.out.println("After change:");
        test1.print();

        System.out.println("sum of numbers: " + test1.sum());
        System.out.println("max value: " + test1.max());
    }
}
