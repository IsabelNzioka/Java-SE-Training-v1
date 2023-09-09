package com.systechafrica.pos;

import java.util.Scanner;



public class Store {
    Scanner scanner = new Scanner(System.in);
    final String DEFAULT_PASSWORD = "Admin123";
    public static int totalPayment;

    public boolean login() {

        int loginEnteries = 1;
        boolean loggedIn = false;
        while(loginEnteries <= 3) {
            System.out.println("Enter password");
            String userPassword = scanner.nextLine();
            if(userPassword.equals(DEFAULT_PASSWORD)) {
                loggedIn = true;
                break;
            }
            System.out.println("Wrong password");
            loginEnteries++;
        }
        return loggedIn;     
    }

    public void displayMenu() {
        System.out.println("-----------------------------------");
        System.out.println("-----     SYSTEM POS SYSTEM    ----");
        System.out.println("-------------------------------------");
        System.out.println("1. ADD ITEM");
        System.out.println("2. MAKE PAYMENT");
        System.out.println("3. DISPLAY RECEIPT");     
    }

    public void addItems(int noOfItemsToPurchase, Item[] items) {
         for (int i = 0; i < items.length; i++) {
            System.out.print("Enter the Item Code: ");
            String itemCode = scanner.next();
                
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter the unit price: ");
            int unitPrice = scanner.nextInt();

            //add all the prices here
            totalPayment += (quantity * unitPrice);

            // add the item to the items array
            Item s = new Item(itemCode, quantity, unitPrice);
            items[i] = s;

            
        }
    }



    public static void main(String[] args) {
        Store app = new Store();
        boolean isLoggedIn = app.login();
        boolean keepShowingMenu = true;
    

         if(isLoggedIn) {
              System.out.println("Happy Shopping Customer :) ");
              System.out.print("Enter the number of items to purchase: ");
              int noOfItems = app.scanner.nextInt(); 
              app.scanner.nextLine(); 

              Item[] items = new Item[noOfItems];
              

              while(keepShowingMenu) {
                app.displayMenu();

                try {
                    System.out.println("Choose your option");
                    int option = app.scanner.nextInt();

                    if(option == 1) {
                          app.addItems(noOfItems, items);

                          System.out.println("Would you like to add another items?: Y/N");
                          String continueShopping = app.scanner.next();

                          if(continueShopping.equalsIgnoreCase("Y")) {
                               System.out.println(("How many items would you like to add?"));
                               int noOfItemsToAdd = app.scanner.nextInt();
                               noOfItems = noOfItemsToAdd;
                               items = new Item[noOfItems];
                          
                               System.out.println("Happy Shopping Customer :)");
                          } 
                        //   else {
                            // System.out.println(totalPayment);
                        //   }

                    } else if(option == 2) {
                        // make payment

                    }else if(option == 3) {
                        // display receipt
                        // quit
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
