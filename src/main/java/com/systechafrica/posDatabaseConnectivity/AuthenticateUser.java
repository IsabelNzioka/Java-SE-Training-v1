package com.systechafrica.posDatabaseConnectivity;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


public class AuthenticateUser extends ConnectToDatabase {

    private static final Logger LOGGER = Logger.getLogger(AuthenticateUser.class.getName());
    public static boolean isUserAMember = false;

    Scanner scanner = new Scanner(System.in);

    public AuthenticateUser(String createTableString) {
        super(createTableString);
    }

    public void signupCustomer() {
        try {
            String insertQuery = "Insert into users (userName, password)values(?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            System.out.print("Enter your name: ");
            String userName = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // TODO - Check if user EXists -
            User user = new User(userName, password);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();

            isUserAMember = true;

            preparedStatement.close();
        } catch (SQLException e) {
            LOGGER.severe("Database connection failure" + e.getMessage());
        }
    }


    public boolean loginCustomer() {
        List<User> users = new ArrayList<>();
        boolean loggedIn = false;
        boolean userExists = false;
        int loginEnteries = 0;

        try {
            String selectQuery = "SELECT * from users;";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {
                int id = resultSet.getInt("user_id");
                String userName = resultSet.getString("userName");
                String password = resultSet.getString("password");
                users.add(new User(id, userName, password));
            }

            while (loginEnteries < 3) {

                System.out.println("Enter your userName - Admin");
                String enteredUserName = scanner.nextLine();

                System.out.println("Enter your password");
                String enteredPassword = scanner.next();
                scanner.nextLine();

                for (User user : users) {
                    if (enteredUserName.equalsIgnoreCase(user.getUserName()) && enteredPassword.equals(user.getPassword())) {
                        loggedIn = true;
                        userExists = true;
                        break;
                    }
                }

                if (userExists) {
                    isUserAMember = true;  //Used for calculating discounts for members only
                    break;
                } else {
                    System.out.println("Wrong credentials. Please try again.");
                }

                loginEnteries++;
            }

            return loggedIn;
        } catch (SQLException e) {
            LOGGER.severe("Database connection failure: " + e.getMessage());
            return loggedIn;
        }
    }
}
