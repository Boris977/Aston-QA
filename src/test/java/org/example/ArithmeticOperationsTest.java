package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArithmeticOperationsTest {



    @Test
    public void testAddition() {
        // Проверяем, что 2 + 3 = 5
        assertEquals(ArithmeticOperations.add(2, 3), 5);
    }

    @Test
    public void testDivision() {
        // Проверяем, что 10 / 2 = 5.0
        assertEquals(ArithmeticOperations.divide(10, 2), 5.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        // Проверяем, что деление на ноль вызывает исключение
        ArithmeticOperations.divide(5, 0);
    }
}