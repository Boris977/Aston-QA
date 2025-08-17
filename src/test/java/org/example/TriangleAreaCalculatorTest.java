package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaCalculatorTest {

    void testArea() {
        assertEquals(15.0, TriangleAreaCalculator.area(6, 5), 0.0001);
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(-3, 4));
    }
}