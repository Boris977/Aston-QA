package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {
    @Test

    void testOperations() {
        assertEquals(7, ArithmeticOperations.add(3, 4));
        assertEquals(1, ArithmeticOperations.subtract(5, 4));
        assertEquals(20, ArithmeticOperations.multiply(4, 5));
        assertEquals(2.5, ArithmeticOperations.divide(5, 2), 0.0001);
    }
}