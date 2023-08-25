package com.systechafrica.operators;

import java.util.logging.Logger;



public class OperatorsDemo {
    private static final Logger LOGGER = Logger.getLogger(OperatorsDemo.class.getName());

    private void arithmeticOperators() {
        //  Addition Operator
        int studentOneAge = 22;
        int studentTwoAge = 19;
        int totalClassAge = studentOneAge + studentTwoAge;

        LOGGER.info("Total class Age: " + totalClassAge);

        // subtraction
        int ageDifference = studentOneAge - studentTwoAge;
        LOGGER.info("Age difference: " + ageDifference);

        //  product of class ages -> Multiplication
        int ageProduct = studentOneAge * studentTwoAge;
        LOGGER.info("Age Product: " + ageProduct);

        // division
        // ? division btwn integers result to an integer value otherwise double value
        int divisionResult = studentOneAge / studentTwoAge;
        LOGGER.info("Division: " + divisionResult);

        // ! To ensure correct values with precision
        double divisionResultInDouble = (double)studentOneAge  / studentTwoAge;
        LOGGER.info("Division with Precision: " + divisionResultInDouble);

        // modulus operator -> remainder of division result
        int remainder = studentOneAge % studentTwoAge;
        LOGGER.info("Remainder: " + remainder);


    }
    

    private void assignmentOperators() {
        // simple assinment operator
        int quantity = 35;

        // addition assignment operator - quantity = quantity + 10
        quantity += 10;
        LOGGER.info("Quanity: " + quantity);

        // multiplication assignment operator - quantity = quantity * 100
        quantity *= 100;
        LOGGER.info("Quanity: " + quantity);


         // division assignment operator - quantity = quantity / 20
        quantity /= 20;
        LOGGER.info("Quanity: " + quantity);
    }
    
    public void comparisionOperators() {
        int studentOneAge = 20;
        int studentTwoAge = 25;

        // Equality Operator
        boolean isStudentOneAgeEqualToStudentTwoAge = studentOneAge == studentTwoAge;
        LOGGER.info("StudentOneAge is Equal to StudentTwoAge: " + isStudentOneAgeEqualToStudentTwoAge);

         // Inequality Operator
        boolean isStudentOneAgeIsNotEqualToStudentTwoAge = studentOneAge != studentTwoAge;
        LOGGER.info("StudentOneAge is Not Equal to StudentTwoAge: " + isStudentOneAgeIsNotEqualToStudentTwoAge);

        // Less than operator
        boolean isStudentOneAgeLessThanStudentTwoAge = studentOneAge < studentTwoAge;
        LOGGER.info("StudentOneAge is Less than StudentTwoAge: " + isStudentOneAgeLessThanStudentTwoAge);

         // Greater than operator
        boolean isStudentOneAgeGreaterThanStudentTwoAge = studentOneAge > studentTwoAge;
        LOGGER.info("StudentOneAge is Greater than StudentTwoAge: " + isStudentOneAgeGreaterThanStudentTwoAge);


        // Greater than or Equal to operator >=
        boolean isStudentOneAgeGreaterThanOrEqualToStudentTwoAge = studentOneAge >= studentTwoAge;
        LOGGER.info("StudentOneAge is Greater than or Equal to StudentTwoAge: " + isStudentOneAgeGreaterThanOrEqualToStudentTwoAge);

                // Less than or Equal to operator <=
        boolean isStudentOneAgeLessThanOrEqualToStudentTwoAge = studentOneAge <= studentTwoAge;
        LOGGER.info("StudentOneAge is Less than or Equal to StudentTwoAge: " + isStudentOneAgeLessThanOrEqualToStudentTwoAge);

    }
    
    
    public static void main(String[] args) {
        OperatorsDemo app = new OperatorsDemo();
        app.arithmeticOperators();
        app.assignmentOperators();
        app.comparisionOperators();
    }
}
