package com.systechafrica.userInput;

import java.util.Scanner;
import java.util.logging.Logger;



public class UserInputUsingScanner {
    // private static final Logger LOGGER = Logger.getLogger(UserInputUsingScanner.class.getName());

  

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in); //Read inpput from the console.
          // SCanner provides methods to parse and extract values from the input stream based on different data types


        // READING STRINGS
        System.out.print("Enter your name:  ");
        String name = scanner.nextLine();
        System.out.println("Hello,  " + name );


        // READING INTERGERS
         System.out.print("Enter your age: ");
         int age = scanner.nextInt();
          System.out.println("You are " + age + " year old");

        // READING DOUBLES
         System.out.print("Enter the price: ");
         double price = scanner.nextDouble();
          System.out.println("The price is: " + price);


        // READING BOOLEAN
         System.out.print("Are you a student? (true/false): ");
         boolean isStudent = scanner.nextBoolean();
          System.out.println("Student status: " + isStudent);

        //READING MULTIPLE VALUES ON A SINGLE LINE
         System.out.print("Enter three numbers (space-separated): ");
         int num1 = scanner.nextInt();
         int num2 = scanner.nextInt();
         int num3 = scanner.nextInt();
        System.out.println("Sum: " + (num1 + num2 + num3));

        // Cloing the scanner
        scanner.close();


    }
    
}
