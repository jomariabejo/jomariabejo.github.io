package org.example;

public class Calculator {
    int add(int a, int b) {
        System.out.println("Single");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("Taken");
        return a + b;
    }

    String add(String a, String b) {
        System.out.println("Divorce");
        return a + b;
    }
}


