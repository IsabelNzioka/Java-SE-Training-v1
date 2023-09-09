package com.systechafrica.pos;

import java.util.Scanner;



public class Store {
    Scanner scanner = new Scanner(System.in);
    final String DEFAULT_PASSWORD = "Admin123";
    public static int count;

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

        System.out.println("choose an option");

        
    }


    public static void main(String[] args) {
        Store app = new Store();
        //  Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = app.login();
    

         if(isLoggedIn) {
              System.out.print("Enter the number of items to purchase: ");
        int noOfItems = app.scanner.nextInt(); 
        app.scanner.nextLine(); 

        Item[] items = new Item[noOfItems];


             
          for (int i = 0; i < items.length; i++) {
            System.out.print("Enter the Item Code: ");
            String itemCode = app.scanner.next();
          
            System.out.print("Enter the quantity: ");
            int quantity = app.scanner.nextInt();

            System.out.print("Enter the unit price: ");
            int unitPrice = app.scanner.nextInt();

            Item s = new Item(itemCode, quantity, unitPrice);
            items[i] = s;
        }
    
      
      

        for(Item i: items) {
            System.out.println(i);
             System.out.println(count += i.getTotalValue());
        }
         } else {
            System.out.println("Maximum attempts failed"); 
         }

      
   
   
        app.scanner.close();
    }

  
}
