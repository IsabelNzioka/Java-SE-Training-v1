package com.systechafrica.operators;

import java.util.Scanner;

public class MoreOnOperators {
    Scanner scanner = new Scanner(System.in);


    // ! AREA OF A TRIANGLE
    private boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
    public void areaOfATriangle() {
        System.out.println("Enter the values of the 3 sides of the triangle: ");
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        if (isValidTriangle(sideA, sideB, sideC)) {
            double s = (double) (sideA + sideB + sideC) / 2F;
            double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
            System.out.println("The area of the triangle: " + area);
        } else {
            System.out.println("Invalid triangle sides");
           
        }
    }

  
 

    public static void main(String[] args) {
       MoreOnOperators app = new MoreOnOperators(); 
       app.areaOfATriangle();
    // 


    }
    
}
