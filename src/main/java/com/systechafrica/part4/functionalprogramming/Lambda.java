package com.systechafrica.part4.functionalprogramming;

import java.time.LocalDate;
import java.time.Month;
import java.util.UUID;

public class Lambda {


    public static void main(String[] args) {
        
        // ? Single line lambda function
        LambdaFun func = () -> UUID.randomUUID().toString();

        // ? Multi linelambda function => use the curly braces and with a return keyword if the function
        // ? return a value
        LambdaFun func2 = () -> {
            String randomUUID = UUID.randomUUID().toString();
            System.out.println(randomUUID);
            return randomUUID.substring(5);
        };


        System.out.println(func.generateRandomUUID());
        System.out.println(func2.generateRandomUUID());


        //* Lambda function which does not return a value - but takes in a single parameter
        GenerateReport report = (student) -> {
            System.out.println("****SYSTECH INTERNSHIP PROGRAMME REPORT****");
            System.out.println("NAME: " +  student.getFirstName());
            System.out.println("EMAIL: " + student.getEmail());
            System.out.println("REG: " + student.getRegNo());

        };

             // * Lambda function which does not return a value - but takes in a single
        // parameter
        // ? you can avoid the parenthesis when only its a single parameter
        GenerateReport report2 = (student) -> {
            System.out.println("****SYSTECH INTERNSHIP PROGRAMME REPORT***");
            System.out.println("   NAME: " + student.getFirstName());
            System.out.println("   EMAIL: " + student.getEmail());
            System.out.println("   REG: " + student.getRegNo());
        };

        // ? If the function takes a parameter and you want to specify the parameter type 
        // ? then you have to enclose the parameter in parenthesis even if the functions takes a single 
        // ? parameter
        GenerateReport report3 = (Student student) -> {
            System.out.println("****SYSTECH INTERNSHIP PROGRAMME REPORT***");
            System.out.println("   NAME: " + student.getFirstName());
            System.out.println("   EMAIL: " + student.getEmail());
            System.out.println("   REG: " + student.getRegNo());
        };



            Student student1 = new Student(1, "Tony", "tony@gmail.com", "001");
            Student student2 = new Student(2, "tony", "mackrine@gmail.com", "002");

            report.generateReport(student2);
            report2.generateReport(student1);


            // * Lambda funtion that takes in more than one parameter and returns a value
            // * You have to use parentesis if there is more than one parameter
        StudentCompare studentCompare = (Student studentOne, Student studentTwo) -> {
            // logic goes here
            System.out.println(studentOne.getFirstName());
            System.out.println(studentTwo.getFirstName());

            return studentOne.getFirstName().equalsIgnoreCase(studentTwo.getFirstName()); //true
            // return studentOne.getFirstName().equals(studentTwo.getFirstName()); //false
        };


        // whenever you specify a parameter type for the first parameter, then 
        // you have to supply the types for all the parameters
        StudentCompare studentCompare2 = (Student studentOne, Student studentTwo) -> {
            // logic goes here
            System.out.println(studentOne.getFirstName());
            System.out.println(studentTwo.getFirstName());

            return studentOne.getFirstName().equalsIgnoreCase(studentTwo.getFirstName()); //true
            // return studentOne.getFirstName().equals(studentTwo.getFirstName()); //false
        };
    
        
        System.out.println(studentCompare.compare(student1, student2));
    }
    
}
