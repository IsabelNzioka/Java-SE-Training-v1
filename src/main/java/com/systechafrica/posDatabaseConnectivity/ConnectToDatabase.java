package com.systechafrica.posDatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import io.github.cdimascio.dotenv.Dotenv;

public class ConnectToDatabase {
       public static Dotenv dotenv = Dotenv.configure().load();
        private static final Logger LOGGER = Logger.getLogger(ConnectToDatabase.class.getName());
        public static Connection connection;
        public static Statement statement;
        public static  String createTableString;

        public  ConnectToDatabase(String createTableString) {
            ConnectToDatabase.createTableString = createTableString;
        }

        public static  void connectToDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String dbUser = dotenv.get("DB_USER");
            String dbPassword = dotenv.get("DB_PASSWORD");
            String dbUrl = dotenv.get("DB_URL");
            
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);   

            // itemCode,quantity,unitPrice;
            statement =  connection.createStatement();
            String createTasksTable = createTableString;
    
            int updateStatus =  statement.executeUpdate(createTasksTable);
            LOGGER.info("Update status= " + updateStatus);



            
        }  catch (ClassNotFoundException e) {
            LOGGER.severe("Unable to obtain class for jdbc driver: " + e.getMessage() );
        } catch (SQLException e) {
            LOGGER.severe("Database operation failure: " + e.getMessage()  );
        }
     }
    
}
