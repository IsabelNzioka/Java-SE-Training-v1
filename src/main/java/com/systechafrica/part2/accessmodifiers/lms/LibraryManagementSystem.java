package com.systechafrica.part2.accessmodifiers.lms;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Book book = new Book();
        book.isbn = "67459475957493";
        book.title = "Java Programming";   //!  Accessed here because they both in the same package
    }
    
}
