package com.systechafrica.atmApplication;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMApplication {
       Scanner scanner = new Scanner(System.in);

        // defaults
        private static final  String DEFAULTPASSWORD = "Admin123";

        int attemptsCount = 3;
        boolean isUserActive = true;

        double balance = 1000.0;
        double withdrawCharges = 0.0;

        StringBuilder receipt = new StringBuilder();


    private void withdrawalTransaction() {
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();
        double transactionFee = ( 2.0/100 * amount);

        if( (balance - amount) < 0) {
        System.out.print("Insufficient Amount \n");
        } else {
                            
        // withdrawCharges = withdrawCharges +  ( 2.0/100 * amount); // for the bank
        balance = balance - amount - transactionFee;
        System.out.println("Your new balance is: " + balance);
        }

        // TODO use flat to fomat the receipts transactions.

         // Appending the transactions to the Stringbuilder to send them as a receipt to the user
        String amountFormatingUsingFlat= String.format("WITHDRAWAL  AMOUNT: %20d%n", amount);
        receipt.append(amountFormatingUsingFlat);

         String chargesFormatingUsingFlat= String.format("TRANSACTION FEE: %20.2f%n", transactionFee); //double
        receipt.append(chargesFormatingUsingFlat);
         
    }


    private void depositTransactions() {
        System.out.print("Enter the deposit amount: ");
        int amount = scanner.nextInt();

        balance = balance + amount;
        System.out.println("Your new balance is: " + balance);

        // Appending the transactions to the Stringbuilder to send them as a receipt to the user
        String amountFormatingUsingFlat = String.format("DEPOSIT AMOUNT: %20d%n", amount);
        receipt.append(amountFormatingUsingFlat);

    }
    
    private void transferFundsTransactions() {
        System.out.print("Enter the transfer amount: ");
        int amount = scanner.nextInt();
        balance = balance - amount;
        System.out.println("Your new balance is: " + balance);

        // Appending the transactions to the Stringbuilder to send them as a receipt to the user
        String amountFormatingUsingFlat = String.format("TRANSFER AMOUNT: %20d%n", amount);
        receipt.append(amountFormatingUsingFlat);

          
    }
    
   private void printReceipts(){
        System.out.println("--------------------  RECEIPT --------------- ");
        System.out.println("*********************************************");

        receipt.append(" -----------            ---------------").append("\n");
        String amountFormatingUsingFlat = String.format("YOUR BALANCE IS: %20.2f%n", balance);
        receipt.append(amountFormatingUsingFlat);

        System.out.println(receipt);               
        System.out.println("*********************************************");

   }
   
   
   
    public void  atmTransactions() throws InterruptedException {
          while (attemptsCount > 0) {
            System.out.print("Please enter your PASSWORD: ");
            String password = scanner.nextLine();


            if (password.equals(DEFAULTPASSWORD)) {
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

                    try {
                       int option = scanner.nextInt();
                       scanner.nextLine();

                    // TODO --------- TRY USING SWITCH STATEMENTS FRO THE VARIOUS OPTIONS.

                    if (option == 1) {
                        System.out.println("Your balance is: Ksh " + balance);
                        Thread.sleep(3000);
                        
                    } else if (option == 2) {
                        depositTransactions();
                        Thread.sleep(3000);
                    } else if (option == 3) {
                        withdrawalTransaction();
                         Thread.sleep(3000);
                       
                    } else if (option == 4) {
                        transferFundsTransactions();
                        Thread.sleep(3000);
                        
                    } else if (option == 5) {
                        // Quit - isUserActive = false;
                        printReceipts();
                        break; 

                    } else {
                        System.out.println("Invalid option. Please choose a valid option.");
                    }
                    }catch(InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid option as a number.");
                        scanner.nextLine();
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
  

    public static void main(String[] args) throws InterruptedException  {
      ATMApplication app = new ATMApplication();
      app.atmTransactions();
       


        // 
      
    }
}
