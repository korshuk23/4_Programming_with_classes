package com.epam.trinagle;

import java.awt.*;
/*
 * Описать  класс,  представляющий  треугольник.
 * Предусмотреть  методы  для  создания объектов,
 * вычисления площади, периметра и точки пересечения медиан.
 */

public class TriangleRunner {
    public static void main(String[] args) {
        Point A = new Point(0, 0);
        Point B = new Point(2, 0);
        Point C = new Point(3, 3);

        Triangle triangle = new Triangle(A, B, C);
        Point centroid = triangle.getCentroid();

        System.out.printf("perimeter: %.3f\n", triangle.perimeter());
        System.out.printf("area: %.3f\n", triangle.area());
        System.out.println("intersection points: " + "[" + centroid.x + ", " + centroid.y + "]");
    }
}
