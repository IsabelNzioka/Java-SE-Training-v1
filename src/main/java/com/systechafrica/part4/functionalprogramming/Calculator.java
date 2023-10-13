package com.systechafrica.part4.functionalprogramming;

@FunctionalInterface
public interface Calculator {
    // ? Only 1 abstract method.
    int calculate(int a, int b, int... numbers);

    // ? I can have multiple default or static methods.
    default int sum(int a, int b) {
        return a + b;
    }

    static String printInfo() {
        return "Functional programming";
    }
}
