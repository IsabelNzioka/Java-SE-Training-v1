package com.systechafrica.part2.accessmodifiers.lms;

public class Book {

    String isbn;
    String title;

    // public static void main(String[] args) {
    // this.isbn = "67490323784959";
    // }
    void printBookDetails() {
        System.out.println(isbn + "-> " + title);
    }


}
