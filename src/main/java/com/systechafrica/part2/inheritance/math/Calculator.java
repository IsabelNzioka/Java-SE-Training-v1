package com.systechafrica.part2.inheritance.math;

public class Calculator {

    // OVERLOADING - used to achieve POlymorphism

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) { // number of parameters
        return a + b + c;
    }

    public long sum(long a, long b) { // modify data types
        return  (a + b);
    }

    public long sum(int a, long b) { // sequence of parameters
        return a +  b;
    }

    // method can change the return type
    public long sum(long a, int b) { // sequence of parameters
        return a + b; 
    }

    // modifying access modifier
    protected double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator app = new Calculator();
        
    }

}