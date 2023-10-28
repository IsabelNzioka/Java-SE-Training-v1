package com.systechafrica.part2.staticClasses;

public class ATMUtils {
    // mask a number  - xxxx-xxxx-xxxx-6754

    public static String maskCardNumber(String cardNumber) {
        String mask = "XXXXXXXXXXXX";
        String postfix = cardNumber.substring(12, cardNumber.length()); //last numbers from index 12
        return mask + postfix;
    }
}
