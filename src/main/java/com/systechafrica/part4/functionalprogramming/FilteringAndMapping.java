package com.systechafrica.part4.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndMapping {

    private static StudentDto mapStudentDto(Student student) {
        return new StudentDto(student.getFirstName(), student.getRegNo());
    }

    private static void workingWithFilterAndMapOnObjectClasses() {
            List<Student> students = List.of(
            new Student(1, "Tony", "tony@gmail.com", "001"),
            new Student(2, "Lena", "lena@gmail.com", "002"),
            new Student(3, "Mackrine", "mackrinetony@gmail.com", "003"),
            new Student(4, "Martin", "martin@gmail.com", "004"),
            new Student(5, "Halkano", "thalkano@gmail.com", "005")
        );


        // filter, map them to a different class
        List<StudentDto> studentDtos =  students.stream()
        .filter(student-> (student.getId() % 2 == 0))
        .map(FilteringAndMapping::mapStudentDto) //* Method reference  - we specify which  class is having that method and then the name of the method we are going to call */
        // .map(student -> mapStudentDto(student))   
        .collect(Collectors.toList());
        

        for(StudentDto studentDto : studentDtos) {
            System.out.println(studentDto);
        }

    }

    private static void mapToIntOrDoubleWithterminationgFunctions() {
           List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        // int sum = 0;
        // for(int number : numbers) {
        //     if(number % 2 == 0) {
        //         sum += number;
        //     }
        // }

        // ? Using Lambda & Method references

       int sum = numbers.stream()
               .filter(number -> number % 2 == 0)
            //  map(number -> number.intValue())
               .mapToInt(Integer::intValue) //return the value of this INteger as an int  .... method reference
               .sum();

        System.out.println(sum);

        // .mapToDouble(Integer::DoubleValue)
        // .forEach(System.out::println)


        // ? reduce
        int sumUsingReduce =  numbers.stream()
               .mapToInt(Integer::intValue)
               .reduce(0, (a, b) -> a +b);
        int product = numbers.stream()
               .mapToInt(Integer::intValue)
               .reduce(1, (a, b) -> a +b);  //identity = 1 

        // ? min & max
        int  min = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .min().getAsInt();
        int max = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .max().getAsInt();    
                         
        System.out.println("Sum = " + sumUsingReduce);
        System.out.println("Product = " + product);
        System.out.println("Min = " + min);
        System.out.println("Max  = " + max);


        

    }

    private static void functionMatchers() {
        List<Integer> numbers = List.of(100, 225, 3955, 4485, 5 ,6, 785, 8, 9, 100);

        boolean anyMatchGreaterThanOrEqualTo1000 = numbers.stream().anyMatch(x -> x >= 100);
        boolean allMatchGreaterThanOrEqualTo1000 = numbers.stream().allMatch(x -> x >= 100); 
        boolean noneMatchGreaterThanOrEqualTo1000 = numbers.stream().noneMatch(x -> x >= 100); 

        System.out.println("Any Match Greater Than Or Equal To 1000 = " + anyMatchGreaterThanOrEqualTo1000);
        System.out.println("All Match Greater Than Or Equal To 1000 = " + allMatchGreaterThanOrEqualTo1000);
        System.out.println("None Match Greater Than Or Equal To 1000 = " + noneMatchGreaterThanOrEqualTo1000);


    }
    private static void intermediaryOperations() {
        List<Integer> numbers = List.of(85, 100, 225, 3955, 4485, 5, 6, 785, 100, 9, 1000);
        int anyNumber = numbers.stream()
                                .findAny()
                                .get();

        List<String> nickNames = List.of("Mhusika", "Ntate", "Yokana", "Jayo");
        String firstNickName = nickNames.parallelStream().findFirst().get();

        System.out.println("Any NUmber = " + anyNumber);
        System.out.println("First Nickname = " + firstNickName);

        // ? Skipping & Limiting
        System.out.println("Skipping and Limiting");
        numbers.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println); // 225,3955,4485

        //  ? Sorting
        System.out.println("Sorting");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        // ? Distinct
        System.out.println("Distict");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);


        // ? peek
        numbers.stream()
                .peek(System.out::println)
                .filter(x -> x % 2 == 0)
                .peek(System.out::println)
                .forEach(number -> System.out.println(" number = " + number));
    }
    




    public static void main(String[] args) {
        // workingWithFilterAndMapOnObjectClasses();
        // mapToIntOrDoubleWithterminationgFunctions();
        functionMatchers();
        intermediaryOperations();
     

    
    }
    
}