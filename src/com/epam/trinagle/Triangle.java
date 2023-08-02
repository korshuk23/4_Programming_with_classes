package com.epam.trinagle;

import java.awt.*;

public class Triangle {
    private final Point A;
    private final Point B;
    private final Point C;
    private final double AB;
    private final double BC;
    private final double CA;

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
        AB = distance(A, B);
        BC = distance(B, C);
        CA = distance(C, A);
    }

    public double distance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
    }

    public double perimeter() {
        return AB + BC + CA;
    }

    public double area() {
        double pp = perimeter() / 2;
        return Math.sqrt(pp * (pp - AB) * (pp - BC) * (pp - CA));
    }

    public Point getCentroid() {
        double x = (A.x + B.x + C.x) / 3.0;
        double y = (A.y + B.y + C.y) / 3.0;
        return new Point((int) x, (int) y);
    }
}
