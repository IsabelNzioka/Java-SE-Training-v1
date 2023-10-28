package com.systechafrica.part4.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Exam {

    public static void main(String[] args) {

        // /print the count of string elements whose length is greater than three.
        List<String> listVal = Arrays.asList("joe", "paul", "Alice", "Tom");
        System.out.println(listVal.stream().filter(x -> x.length() > 3).count());
        // The count() method is used to count the number of elements in the stream.
    }

}
