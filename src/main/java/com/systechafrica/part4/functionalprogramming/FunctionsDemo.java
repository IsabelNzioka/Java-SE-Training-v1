package com.systechafrica.part4.functionalprogramming;

import java.util.function.Function;

public class FunctionsDemo {

    public static void main(String[] args) {
        Function<Student, Boolean> studentFunction = student -> student.getEmail().equals("isabel@gmail.com");
        // Student - denotes the Object we are going to receive, 
        // Boolean - The type

        Student student = new Student(1,"Tony", "tony@gmail.com", "001");

        System.out.println(studentFunction.apply(student));
    }
    
}
