package com.systechafrica.part3.exceptionhandling;

public class ExceptionHandlingDemo {

    public void workingwithBasicEXceptions(Calculator calculator) {
          //    double result =  calculator.divide(6, 0);
    //    System.out.println(result);
    //    try {
    //     System.out.println("Before connect");
    //     calculator.connect();

    //      System.out.println("After connect");  //? Only printed when there is no exception is thrown
    //    } catch(Exception e) {
    //     System.out.println("Exception: " + e.getMessage());
    //    }

    // try {
    //     double result = calculator.divide(6L, 0L);
    //     System.out.println(result);
    // } catch (Exception e) {
    //    System.out.println(e.getMessage());
    // }
    //    System.out.println("Processing data ........");
      try {
        calculator.sum(2, 0);
      } catch (MyCustomException e) {
       System.out.println(e.getMessage());
        // e.printStackTrace();
    }
     System.out.println("Processing data ........");


    }

    public static void main(String[] args)  {
        // Calculator calculator = new Calculator();
        ExceptionHandlingDemo app = new ExceptionHandlingDemo();
        // app.workingwithExceptions();
  

     
    }



    
}
