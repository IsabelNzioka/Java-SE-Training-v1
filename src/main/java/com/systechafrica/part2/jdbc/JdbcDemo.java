package com.systechafrica.part2.jdbc;

import java.sql.ResultSet;

public class JdbcDemo {

    public static void main(String[] args) {
        try {
              DataAccess mysql = new MysqlDataAccess();
        mysql.connect();
        ResultSet productResultSet = mysql.executeQuery("SELECT * FROM products");
        while(productResultSet.next()) {
            String productName = productResultSet.getString("name");
            int productPrice = productResultSet.getInt("price");
            System.out.println("Product: " + productName + " Price: " + productPrice);
        }
        // mysql.close();
            
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
      
    }
    
}
