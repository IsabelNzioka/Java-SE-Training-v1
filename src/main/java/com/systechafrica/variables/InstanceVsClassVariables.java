package com.systechafrica.variables;

public class InstanceVsClassVariables {

    static String message = "Hello, World!";
    String message2 = "Hello, World 2";

    String message3 = "World";


    public void test() {
        System.out.println(message);
        System.out.println(message2);

        message = "Hello";
    }

     public  static void test2() {
        System.out.println(message);
        // System.out.println(message2); //! Error - Cannot access variables which are not static.
        // ? An instance variable declared within the class can only be accessed inside NONE STATCI  methods of the class and 
        // ? if you want to access them then you need to create an instance of the class.

       

    }

    public void test3() {
    message = "World";
    }


    public static void main(String[] args) {
        InstanceVsClassVariables app = new InstanceVsClassVariables();
        SampleClass vc = new SampleClass();

        System.out.println( SampleClass.name); // Class variables  - can only be accessed using the class name followed by the variable name.
        // System.out.println(SampleClass.age);  //! Error - Cannot make a static reference to the non-static field SampleClass.age  
        // ! Cannot be accessed using the class itself. ( does not use the static keyword)
        // ! solution - create an instance of the class and make use of the object of that particular class - vc
        System.out.println(vc.age);

        // System.out.println(vc.name); //? can be accessed using the vc object BUT it is NOT the recommended way!

        System.out.println(app.message3);
        System.out.println(app.message2);
        System.out.println(message);
        
        
    }
    
}
