package org.example;

public class IntegerComparator {

    public static String compare(int a, int b) {
        if (a > b) return "Первое больше";
        else if (a < b) return "Первое меньше";
        else return "Равно";
    }
}
