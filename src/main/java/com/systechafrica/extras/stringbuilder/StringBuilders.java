package com.systechafrica.extras.stringbuilder;

public class StringBuilders {

  
        public static StringBuilder work(StringBuilder a,  StringBuilder b) {
                a = new StringBuilder("a");
                b.append("b");  //s2b  
                return a; // a
        }
        public static void main(String[] args) {
      

        StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");

        System.out.println("s1 = " + s1); //s1
        System.out.println("s2 = " + s2);  //s2

        StringBuilder s3 = work(s1, s2); //a

        System.out.println("s1 = " + s1); //s1
        System.out.println("s2 = " + s2); //s2b
        System.out.println("s3 = " + s3); //a
        }
       
    
}
