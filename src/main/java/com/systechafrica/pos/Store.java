package com.systechafrica.pos;


import java.util.ArrayList;
import java.util.Scanner;

import com.systechafrica.util.Login;

public class Store {
    Scanner scanner = new Scanner(System.in);
  
    public static int totalPayment;
    static int noOfItemsToPurchase = 0;

    // static Item[] items = new Item[noOfItemsToPurchase];
    static ArrayList<Item> items = new ArrayList<>();
    static boolean isCustomerShopping = true;
    static boolean isPaymentMade = false;

     int change;
     int amountPaidByCustomer = 0;


    public void displayMenu() {
        System.out.println("-----------------------------------");
        System.out.println("-----     SYSTEM POS SYSTEM    ----");
        System.out.println("-------------------------------------");
        System.out.println("1. ADD ITEM");
        System.out.println("2. MAKE PAYMENT");
        System.out.println("3. DISPLAY RECEIPT");  
    }

    public void addItems() {
        System.out.print("Enter the number of items to purchase: ");
        int noOfItemsToPurchase = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < noOfItemsToPurchase; i++) {
            System.out.print("Enter the Item Code: ");
            int itemCode = scanner.nextInt();
    
             System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); 
    
            System.out.print("Enter the unit price: ");
            int unitPrice = scanner.nextInt();

            totalPayment += (quantity * unitPrice); 

            // Add item to the items array
            Item s = new Item(itemCode, quantity, unitPrice);

            // items[i] = s;
            items.add(s);  //keep track of all added items       
        }
    }

    public void payment() {
        System.out.println("_________________________________________________");
        System.out.println("ItemCode   Quantity   UnitPrice   TotalPrice");
        for (Item item : items) {
            System.out.printf("%-10s %-12s %-9s %-10s%n", item.getItemCode(),item.getQuantity(), item.getUnitPrice(), item.getTotalValue());
           
        }
        System.out.println("___________________________________________________");
        System.out.println("TOTAL:     " + totalPayment);

        System.out.println("Enter the amount given by customer");
        amountPaidByCustomer = scanner.nextInt();
        scanner.nextLine();

        if(amountPaidByCustomer > totalPayment) {
            change = amountPaidByCustomer - totalPayment;
        } 

        System.out.println("Change:     " + change);
        System.out.println("***************************************************");
        System.out.println("THANK YOU FOR SHOPPING WITH US");
        System.out.println("***************************************************");

        isPaymentMade = true;
    }


    public void displayReceipt() {
                System.out.println("_________________________________________________");
                System.out.println("ItemCode   Quantity   UnitPrice   TotalPrice");
                for (Item item : items) {
                    System.out.printf("%-10s %-12s %-9s %-10s%n", item.getItemCode(),item.getQuantity(), item.getUnitPrice(), item.getTotalValue());
                
                }
                System.out.println("___________________________________________________");
                System.out.println("TOTAL:     " + totalPayment);
                System.out.println("Amount paid: " + amountPaidByCustomer);
                System.out.println("Change:     " + change);
                System.out.println("***************************************************");
                System.out.println("THANK YOU FOR SHOPPING WITH US");
                System.out.println("***************************************************");
    }
    
    public static void main(String[] args) {
        Store app = new Store();

        boolean isLoggedIn = Login.login();
        boolean keepShowingMenu = true;

        if (isLoggedIn) {
            System.out.println("Happy Shopping Customer :) ");

            while (keepShowingMenu) {
                // Y -continue shopping
                // N - showMenu 
                app.displayMenu();
            
                try {
                    System.out.println("Choose your option");
                    int option = app.scanner.nextInt();
                    app.scanner.nextLine();

                    if (option == 1 ) {
                        while(isCustomerShopping) {
                            app.addItems();

                                System.out.println("Would you like to add more items?: Y/N");
                                String continueShopping = app.scanner.next();

                                if(continueShopping.equalsIgnoreCase("N")) {
                                    // end shopping - display menu
                                    // System.out.println(totalPayment);
                                    isCustomerShopping=false;
                                 }
                        }
                        System.out.println("Thank you for shopping with us - Proceed to payment/receipt printing.");
          
                    } else if (option == 2) {
                        // make payment
                        app.payment();
                    } else if (option == 3) {
                        if(isPaymentMade) {
                           // display receipt then quit
                            app.displayReceipt();
                            keepShowingMenu = false;
                        } else {
                            System.out.println("Please make the payment first before printing the receipt");
                        }
                          
                    } else {
                        System.out.println("Invalid option... try again");
                    }
                } catch (Exception e) {
                    app.scanner.nextLine();
                    System.out.println("Invalid option - Integers only... try again");
                }
            }
        } else {
            System.out.println("Maximum attempts failed"); 
        }
        app.scanner.close();
    }
}
