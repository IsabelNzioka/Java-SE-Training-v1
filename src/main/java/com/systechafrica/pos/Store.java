package com.systechafrica.pos;

import java.util.Scanner;



public class Store {
    Scanner scanner = new Scanner(System.in);

    final String DEFAULT_PASSWORD = "Admin123";
    public static int count;

  

    public static void main(String[] args) {
        // Store app = new Store();
         Scanner scanner = new Scanner(System.in);

    

        System.out.print("Enter the number of items to purchase: ");
        int noOfItems = scanner.nextInt(); 
        scanner.nextLine(); 

        Item[] items = new Item[noOfItems];
        
          for (int i = 0; i < items.length; i++) {
            System.out.print("Enter the Item Code: ");
            String itemCode = scanner.next();
          
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter the unit price: ");
            int unitPrice = scanner.nextInt();

            Item s = new Item(itemCode, quantity, unitPrice);
            items[i] = s;
        }
    
      
      

        for(Item i: items) {
            System.out.println(i);
             System.out.println(count += i.getTotalValue());
        }
   
        scanner.close();
    }

  
}
