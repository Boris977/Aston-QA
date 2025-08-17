package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleAreaCalculatorTest {

    @Test
    public void testAreaCalculation() {
        // Проверяем, что площадь треугольника с основанием 10 и высотой 5 равна 25
        assertEquals(TriangleAreaCalculator.area(10, 5), 25.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeBase() {

        TriangleAreaCalculator.area(-3, 4);
    }
}