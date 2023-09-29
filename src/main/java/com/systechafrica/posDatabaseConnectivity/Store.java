package com.systechafrica.posDatabaseConnectivity;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;


import com.systechafrica.part3.logging.CustomFormatter;




public class Store extends ConnectToDatabase {
    Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger(Store.class.getName());
    private static FileHandler fileHandler;
    
    public static int totalPayment;

    // static int noOfItemsToPurchase = 0;
    static boolean isCustomerShopping = true;
    static boolean isPaymentMade = false;
    static int numberOfItemsPurchased = 0;
    static boolean keepShowingMenu = true;

    int change;
    int amountPaidByCustomer = 0;

    public Store(String createTableString) {
        super(createTableString);  
    }


  
    

    public static void fileHandler() {
        try {
        //    fileHandler = new FileHandler("pos.txt", true);
        //     CustomFormatter formatter = new CustomFormatter();
        //     LOGGER.addHandler(fileHandler);
        //     fileHandler.setFormatter(formatter);
        
             // Check if the FileHandler is already created
             if (fileHandler == null) {
                fileHandler = new FileHandler("pos.txt", true);
                CustomFormatter formatter = new CustomFormatter();
                LOGGER.addHandler(fileHandler);
                fileHandler.setFormatter(formatter);
            }
            
        }catch (SecurityException e) {
            LOGGER.severe("Unable to obtain security permissions for the Log file" + e.getMessage());
        }
         catch (IOException e) {
            LOGGER.severe("Unable to obtain read/write permissions for the Log file" + e.getMessage());
        }

    }
  

     public void displayMenu() {
        System.out.println("-----------------------------------");
        System.out.println("-----     SYSTEM POS SYSTEM    ----");
        System.out.println("-------------------------------------");
        System.out.println("1. ADD ITEM");
        System.out.println("2. MAKE PAYMENT");
        System.out.println("3. DISPLAY RECEIPT");  
        System.out.println("4. Quit"); 
    }

    private void addItemsToDB() {
        try {
            String insertQuery = "Insert into itemsggg (itemCode, quantity, unitPrice, totalValue)values(?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            System.out.print("Enter the number of items to purchase: ");
            int noOfItemsToPurchase = scanner.nextInt();
             scanner.nextLine();

       // Read task details
        for (int i = 1; i <= noOfItemsToPurchase; i++) {
            numberOfItemsPurchased += 1;

            System.out.print("Enter the Item Code for item " + numberOfItemsPurchased + ": ");
            int itemCode = scanner.nextInt();

            System.out.print("Enter the quantity for item " + numberOfItemsPurchased + ": ");
            int quantity = scanner.nextInt();
    
            System.out.print("Enter the unit price for item " + numberOfItemsPurchased + ": ");
            int unitPrice = scanner.nextInt();
            scanner.nextLine(); 

            totalPayment += (quantity * unitPrice); 
            // TODO - CHECK FOR NEGATIVE INPUT

            Item item = new Item(itemCode, quantity, unitPrice);

            preparedStatement.setInt(1, item.getItemCode());
            preparedStatement.setInt(2, item.getQuantity());
            preparedStatement.setInt(3, item.getUnitPrice());
            preparedStatement.setInt(4, item.getTotalValue());
         
            preparedStatement.executeUpdate();
              
        }
        preparedStatement.close();


        System.out.println("Would you like to add more items?: Y/N");
        String continueShopping = scanner.next();
    
        if(continueShopping.equalsIgnoreCase("N")) {
                // end shopping - display menu
                // System.out.println(totalPayment);
                 isCustomerShopping=false;
                                }

        } catch (SQLException e) {
            isCustomerShopping = false;
            keepShowingMenu = false;
            LOGGER.severe("Database connection failure" + e.getMessage()); 
        }
    }


    private void displayItemsFromDB() {
        try {
           // TODO - CHECK IF ITS EMPTY
            String selectQuery = "SELECT * from items;";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            System.out.println("_________________________________________________");
            System.out.println("ItemCode   Quantity   UnitPrice   TotalPrice");
            while (resultSet.next()) { 
                // ItemCode   Quantity   UnitPrice   TotalPrice
                int id = resultSet.getInt("item_id");
                int itemCode = resultSet.getInt("itemCode");
                int quantity = resultSet.getInt("quantity");
                int unitPrice = resultSet.getInt("unitPrice");
                int totalValue = resultSet.getInt("totalValue");

                Item dbItem = new Item(id, itemCode, quantity, unitPrice, totalValue);

               
                System.out.printf("%-10s %-12s %-9s %-10s%n", dbItem.getItemCode(),dbItem.getQuantity(), dbItem.getUnitPrice(), dbItem.getTotalValue());
                totalPayment += dbItem.getTotalValue();

            }
            System.out.println("___________________________________________________");
            System.out.println("TOTAL: ---------------------------------------- " + totalPayment);

            resultSet.close();           
        } catch (SQLException e) {
            LOGGER.severe("Database connection failure" + e.getMessage()); 
        }
    }

    public void payment() {
        displayItemsFromDB();

        System.out.println("Enter the amount given by customer");
        amountPaidByCustomer = scanner.nextInt();
        scanner.nextLine();
        // TODO - INSUFFICIENT AMOUNT.
        if(amountPaidByCustomer > totalPayment) {
            change = amountPaidByCustomer - totalPayment;
        } 
        System.out.println("Change: ---------------------------------------- " + change);
        System.out.println("***************************************************");
        System.out.println("THANK YOU FOR SHOPPING WITH US - PRINT RECEIPT");
        System.out.println("***************************************************");

        isPaymentMade = true;    
    }

    public void displayReceipt() {
        displayItemsFromDB();
        System.out.println("Amount paid: ---------------------------------- " + amountPaidByCustomer);
        System.out.println("Change: --------------------------------------- " + change);
        System.out.println("***************************************************");
        System.out.println("THANK YOU FOR SHOPPING WITH US");
        System.out.println("***************************************************");
}


     public void clearItemsFromDB() {
        // delete after printing receipt.
       

    }

     public static void main(String[] args) {
        Store app = new Store("CREATE TABLE IF NOT EXISTS items (item_id INT AUTO_INCREMENT PRIMARY KEY,itemCode INT, quantity INT,unitPrice INT, totalPrice INT,created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)  ENGINE=INNODB;");
        AuthenticateUser auth = new AuthenticateUser("CREATE TABLE IF NOT EXISTS users (user_id INT AUTO_INCREMENT PRIMARY KEY,userName VARCHAR(255) NOT NULL, password VARCHAR(255) NOT NULL,created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)  ENGINE=INNODB;");
      
        fileHandler();
        
         try {
            // database
              connectToDatabase();
            //   auth.signupCustomer();
    
            boolean isLoggedIn = auth.loginCustomer();
            // boolean keepShowingMenu = true;

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
                                app.addItemsToDB();
    
                               
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
                              
                        } else if(option == 4) {
                            // TODO - CHECK IF PAYMADE IS MADE, BUT THE RECEIPT WAS NOT PRINTED BEFORE QUITING.
                            keepShowingMenu = false;
                        }
                        
                        else {
                            System.out.println("Invalid option... try again");
                        }
                    } catch (Exception e) {
                        app.scanner.nextLine();
                       numberOfItemsPurchased -= 1;
                        System.out.println("Invalid option - Integers only... try again");
                    }
                }
            } else {
                System.out.println("Maximum attempts failed"); 
            }


             app.scanner.close();
              statement.close();
              connection.close();
            
         } 
        catch (Exception e) {
            LOGGER.severe("Oops an error occurred: " + e.getMessage());
        }
        
     }
    
}
