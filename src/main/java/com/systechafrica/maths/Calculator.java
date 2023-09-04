package com.systechafrica.maths;

import java.util.Scanner;

public class Calculator {

    // Instance => does not have static keyword => can be accessed using object of the class.
    public int sum(int a, int b, int ...otherNumbers) { //! var args
        int sum = a + b;

        for (int i = 0; i < otherNumbers.length; i++) {
            sum += otherNumbers[i];
        }
        return sum;
    }

    //  public int sum(int a, int b, int c, int d) {
    //     return a + b + c + d;
    // }

    public static void main(String ...args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of space separated numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(calculator.sum(a, b, c, d));
        System.out.println(calculator.sum(10, 20, 90, 30, 50, 50, 90));

    }
    
}
