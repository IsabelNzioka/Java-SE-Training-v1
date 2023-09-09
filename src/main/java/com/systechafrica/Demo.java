package com.systechafrica;

public class Demo {
    

    // Instance methods
    public int addTwoNumbers(int a, int b) {
        int result = a + b;
        return result;
    }

    // class methods
    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String ...args) {
        Demo demo = new Demo();
        demo.addTwoNumbers(5, 10);
        add(5, 10);  
}
}