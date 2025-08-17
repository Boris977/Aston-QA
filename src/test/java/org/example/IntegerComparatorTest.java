package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerComparatorTest {

    @Test
    void testCompare() {
        assertEquals("Первое болше", IntegerComparator.compare(10, 5));
        assertEquals("Второе больше", IntegerComparator.compare(3, 7));
        assertEquals("Равно", IntegerComparator.compare(4, 4));
    }
}