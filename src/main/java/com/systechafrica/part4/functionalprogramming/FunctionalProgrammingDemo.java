package com.systechafrica.part4.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionalProgrammingDemo {

    //? whwnever you want to make use of an inteface whic is not implemented you have to make your wn implementation
    // public void functions() {
    //     Calculator Calculator = new Calculator() {
    //         @Override
    //         public int calculate(int a, int b) {
    //             return 0;
    //         }
    //     }
    // }


    //?  Implementing the above using Lambda expressions
    public void functions() {
        // Calculator calculator = (int a, int b) -> {return a + b;};
        // Calculator calculator = (a, b) -> a + b;
        Calculator calculator = (a, b, numbers) -> {
            int sum = a + b;
            for(int number:numbers) {
                sum += number;
            }
            return sum;
        };
        System.out.println(calculator.calculate(5, 6, 5));
    }


    public void lambdaInFunction() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        integers.forEach(number -> System.out.println(number));
        // for(int number : integers) {
        //     System.out.println(number);
        // }

    }

    public boolean evenNumbers(int number){
        return number % 2 == 0;
    }
     public int mapToSquare(int number){
        return number * number;
    }

    public void filterAndMapNormalWay() {
        List<Integer> numbers = List.of(1,2,3,4,5);
        // create a stream
        Stream<Integer> stream = numbers.stream();

        // filter a stream = creates a new stream.
        // stream.filter(number -> evenNumbers(number));

        //using lambda
        Stream<Integer> filteredStream = stream.filter(number -> number % 2 == 0);

        //map = for transformation
        // Stream<Integer> squareIntegerStream = filteredStream.map(number -> mapToSquare(number));
        Stream<Integer> squareIntegerStream = filteredStream.map(number -> number * number);

        // display final product
        squareIntegerStream.forEach(number -> System.out.println(number));   

    }


       public void filterAndMapChaining() {
        List<Integer> numbers = List.of(1,2,3,4,5);
         numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(number -> System.out.println(number));   

                printInfo(numbers, (number) -> number % 2 == 0);

    }

    // sudo mysql -u root
    // ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '*

    public static void printInfo(List<Integer> list, Predicate<Integer> evenNumberFunction) {
        list.stream().filter(evenNumberFunction)
        .forEach(System.out::println);
    }

    public static void main(String[] args) {
        FunctionalProgrammingDemo demo = new FunctionalProgrammingDemo();
        // demo.functions();
        // demo.lambdaInFunction();
        // demo.filterAndMapNormalWay();
         demo.filterAndMapChaining();





    }
}