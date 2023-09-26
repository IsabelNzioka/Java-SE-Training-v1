package com.systechafrica.part3.exceptionhandling;

public class ExceptionHandlingDemo {

    public void workingwithBasicEXceptions(Calculator calculator) {
             double result =  calculator.divide(6, 0);
       System.out.println(result);
       try {
        System.out.println("Before connect");
        calculator.connect();

         System.out.println("After connect");  //? Only printed when there is no exception is thrown
       } catch(Exception e) {
        System.out.println("Exception: " + e.getMessage());
       }

    try {
        double res = calculator.divide(6L, 0L);
        System.out.println(res);
    } catch (Exception e) {
       System.out.println(e.getMessage());
    }
       System.out.println("Processing data ........");
      try {
        calculator.sum(2, 0);
      } catch (MyCustomException e) {
       System.out.println(e.getMessage());
        // e.printStackTrace();
    }
     System.out.println("Processing data ........");


    }

   private void workingwithExceptions() {
        try {
          StudentController studentController = new StudentController();
          studentController.addStudent(null);
        } catch (StudentDetailsMissingException e) {
            System.out.println(e.getMessage());
        } 
              SMSSender sender = new SMSSender();
            sender.sendMessage("Your details have been saved");
   }

    public static void main(String[] args)  {
        ExceptionHandlingDemo app = new ExceptionHandlingDemo();
        Calculator calculator = new Calculator();
        // app.workingwithBasicEXceptions(calculator);

        app.workingwithExceptions();
  

     
    }



    
}
