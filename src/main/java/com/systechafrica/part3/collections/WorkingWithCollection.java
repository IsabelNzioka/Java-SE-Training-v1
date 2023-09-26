package com.systechafrica.part3.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WorkingWithCollection {

    public static void main(String[] args) {
        // Collection<Student> students = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Emmah", "001", "emmah@gmail.com");
        Student student2 = new Student("Humphrey", "002", "humprey@gmail.com");
        Student student3 = new Student("Winnie", "003", "winnie@gmail.com");


        // ADD
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // printList(students);

        // contains
        System.out.println(students.contains(student1));

        // set - updating values
         Student student = new Student("Tonny", "001", "tonny@gmail.com");
        students.set(0,student );

        // indexof
        System.out.println(students.indexOf(student));
        System.out.println(students.indexOf(student1)); //? -1

        // remove elements
        students.add(student1);
        students.add(student1);
        students.remove(student1);

         printList(students);

        //  clear
        students.clear();

        System.out.println(students.isEmpty());
        // System.out.println(students);

       
    }

    private static void printList(List<Student> students) {
        for(int i = 0; i <students.size(); i++) {
            System.out.println(students.get(i));
        }
      }
    
}
