package com.systechafrica.util;

import java.util.Scanner;

import com.systechafrica.constants.Constants;

public class Login {
    static Scanner scanner = new Scanner(System.in);

   
// Login.login
    public static boolean login() {
        int loginEnteries = 1;
        boolean loggedIn = false;
        while(loginEnteries <= 3) {
            System.out.println("Enter password");
            String userPassword = scanner.nextLine();
            if(userPassword.equals(Constants.DEFAULT_PASSWORD)) {
                loggedIn = true;
                break;
            }
            System.out.println("Wrong password");
            loginEnteries++;
        }
        return loggedIn;
    }
    
}
