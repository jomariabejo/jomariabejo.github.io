package org.example;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumInt = calculator.add(5, 3);
        System.out.println("Sum of two integers: " + sumInt);

        double sumDouble = calculator.add(2.5, 4.7);
        System.out.println("Sum of two doubles: " + sumDouble);

        String combinedStrings = calculator.add("1, ", "1!");
        System.out.println("Combined strings: " + combinedStrings);
    }
}
