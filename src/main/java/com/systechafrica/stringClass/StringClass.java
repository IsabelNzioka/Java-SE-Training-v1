package com.systechafrica.stringClass;

public class StringClass {

    public void printing() {
        // formate specifieer
        int x = 10;
        float y = 12.56f;
        char z = 'A';

        System.out.printf("Hello %d %f %c World", x,y,z);

        // ? Flag
        System.out.printf("%5d\n", x); // ---10
        System.out.printf("%05d", x);

    }

    public void stringObjects() {
        String str1 = "Java Program";
        String str2 = str1.replace('a', 'z');

        System.out.println(str1);
        System.out.println(str2);


    }

    public static void main(String[] args) {
        StringClass app = new StringClass();

        // app.printing(); 
        app.stringObjects();
    }
    
}
