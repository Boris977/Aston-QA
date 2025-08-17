package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntegerComparatorTest {

    @Test
    public void testFirstIsGreater() {
        // Проверяем, что 5 больше 3
        assertEquals(IntegerComparator.compare(5, 3), "Первое больше");
    }

    @Test
    public void testSecondIsGreater() {
        // Проверяем, что 2 меньше 4
        assertEquals(IntegerComparator.compare(2, 4), "Первое меньше");
    }

    @Test
    public void testNumbersAreEqual() {
        // Проверяем, что 7 и 7 равны
        assertEquals(IntegerComparator.compare(7, 7), "Равно");
    }
}