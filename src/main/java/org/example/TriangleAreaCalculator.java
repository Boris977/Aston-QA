package org.example;

public class TriangleAreaCalculator {
    public static double area(double base, double height) {
        if (base < 0 || height < 0) throw new IllegalArgumentException("Отрицательные значения");
        return 0.5 * base * height;
    }
}

