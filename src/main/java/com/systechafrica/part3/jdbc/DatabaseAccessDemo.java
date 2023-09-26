package com.systechafrica.part3.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.part3.logging.CustomFormatter;

public class DatabaseAccessDemo {
    private static final Logger LOGGER = Logger.getLogger(DatabaseAccessDemo.class.getName());

     public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
            FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("workingWithDatabase.txt", true);
            CustomFormatter formatter = new CustomFormatter();

            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);

            //Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create a connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/workingwithdatabase", "root", "Nzioka15*");   


            // Create a statement from the connection.
        Statement statement =  connection.createStatement();

        String createTasksTable = "CREATE TABLE IF NOT EXISTS tasks (task_id INT AUTO_INCREMENT PRIMARY KEY,title VARCHAR(255) NOT NULL,start_date DATE,due_date DATE,status TINYINT NOT NULL,priority TINYINT NOT NULL,description TEXT,created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)  ENGINE=INNODB;";
        
        // execute Queries
       int updateStatus =  statement.executeUpdate(createTasksTable);
       LOGGER.info("Update status= " + updateStatus);

       // execute Insert statement
        // String insertQuery = "insert into tasks (title,start_date,due_date,status,priority,description)values('Add driver to the pom.xml','2023-09-22','2023-09-25',0,1,'updating drivers to the class path');";
        // int numberofRowsInserted =   statement.executeUpdate(insertQuery);
        // LOGGER.info("Number of Rows Inserted= " + numberofRowsInserted);
        String insertQuery = "insert into tasks (title,start_date,due_date,status,priority,description)values(?,?,?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

        // Read task details
        Task task = getTaskFromUser(scanner);
        preparedStatement.setString(1, task.getTitle());
        preparedStatement.setString(2, task.getStartDate().toString());
        preparedStatement.setString(3, task.getDueDate().toString());
        preparedStatement.setInt(4, task.getTaskStatus());
        preparedStatement.setInt(5, task.getPriority());
        preparedStatement.setString(6, task.getDescription());
        int noOfRows = preparedStatement.executeUpdate();
        LOGGER.info("Number of Rows=" + noOfRows);

        // Execute Selection

            String selectQuery = "SELECT * from tasks;";

            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                // task_id,title,start_date,due_date,status,priority,description
                int id = resultSet.getInt("task_id");
                String title = resultSet.getString("title");
                LocalDate startDate = LocalDate.parse(resultSet.getString("start_date"));
                LocalDate dueDate = LocalDate.parse(resultSet.getString("due_date"));
                int status = resultSet.getInt("status");
                int priority = resultSet.getInt("priority");
                String description = resultSet.getString("description");

                //map to object
                Task dbTask = new Task(id, title, startDate, dueDate, status, priority, description);

                System.out.println(dbTask);

            }

              // release resources bottom up
              resultSet.close();
              preparedStatement.close();
              statement.close();
              connection.close();

            
        } catch (SecurityException e) {
            LOGGER.severe("Unable to obtain security permissions for the Log file" + e.getMessage());
        }
        catch (IOException e) {
            LOGGER.severe("Unable to obtain read/write permissions for the Log file" + e.getMessage());
        }
         catch (ClassNotFoundException e) {
            LOGGER.severe("Unable to obtain class for jdbc driver" + e.getMessage());
        } catch (SQLException e) {
            
            LOGGER.severe("Database connection failure" + e.getMessage());
        } catch (Exception e) {
            LOGGER.severe("Oops an error occurred: " + e.getMessage());
        }
         
     }


     private static Task getTaskFromUser(Scanner scanner) { //return a task object
        // read inputs
        // title,start_date,due_date,status,priority,description
        System.out.println("Enter task title: ");
        String title = scanner.nextLine();

        System.out.println("Enter task start date(YYYY-MM-DD): ");
        LocalDate startDate = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter task due date(YYYY-MM-DD): ");
        LocalDate dueDate = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter task task status (0/1): ");
        int taskStatus = scanner.nextInt();

        System.out.println("Enter task task priority: ");
        scanner.nextLine();
        int priority = scanner.nextInt();

        System.out.println("Enter task description: ");
        scanner.nextLine();
        String description = scanner.nextLine();

        Task task = new Task(title, startDate, dueDate, taskStatus, priority, description);
        return task;
    }

}
