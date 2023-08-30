package com.systechafrica.atmApplication;


import java.util.Scanner;

public class ATMApplication {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // defaults
        String defaultPassword = "Admin123";
        double balance = 1000.0;

        int attemptsCount = 3;

        boolean isUserActive = true;
        double withdrawCharges = 0.0;


        // 
        while (attemptsCount > 0) {
            System.out.print("Please enter your PASSWORD: ");
            String password = scanner.nextLine();


            if (password.equals(defaultPassword)) {
                while (isUserActive) {
                    System.out.println("************************************\n");
                    System.out.println("ATM SIMULATOR\n");
                    System.out.println("''''''''''''''''''''''''''''''''''''\n");

                    System.out.println("ATM SERVICES\n");
                    System.out.println("____________________________________\n");
                    System.out.println("1: Check Balance");
                    System.out.println("2: Deposit");
                    System.out.println("3: Withdraw");
                    System.out.println("4: Transfer Cash");
                    System.out.println("5: Quit");
                    System.out.println("''''''''''''''''''''''''''''''''''''\n");

                    System.out.print("Choose your option: ");
                    int option = scanner.nextInt();

                    if (option == 1) {
                        System.out.println("Your balance is: Ksh " + balance);
                        Thread.sleep(3000);
                        
                        
                    } else if (option == 2) {
                        System.out.print("Enter the deposit amount: ");
                        int amount = scanner.nextInt();

                        balance = balance + amount;
                        System.out.println("Your new balance is: " + balance);
                        Thread.sleep(3000);
                    } else if (option == 3) {
                        System.out.print("Enter amount to withdraw: ");
                        int amount = scanner.nextInt();

                        if( (balance - amount) < 0) {
                          System.out.print("Insufficient Amount \n");
                         } else {

                        // withdrawCharges = withdrawCharges +  ( 2.0/100 * amount); // for the bank
                        balance = balance - amount - ( 2.0/100 * amount);
                        System.out.println("Your new balance is: " + balance);
                         }
                         Thread.sleep(3000);
                       
                    } else if (option == 4) {
                         System.out.print("Enter the transfer amount: ");
                        int amount = scanner.nextInt();
                        balance = balance - amount;
                        System.out.println("Your new balance is: " + balance);
                        Thread.sleep(3000);
                        
                    } else if (option == 5) {
                        // Quit - isUserActive = false;
                        break; 

                    } else {
                        System.out.println("Invalid option. Please choose a valid option.");
                    }
                }

                break;

            } else {
                attemptsCount--;
                System.out.println("Wrong password. You have " + attemptsCount + " attempts left");
            }
        }

        scanner.close();
    }
}
