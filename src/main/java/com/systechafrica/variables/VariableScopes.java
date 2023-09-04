package com.systechafrica.variables;

import java.util.logging.Logger;

public class VariableScopes {
    private static final Logger LOGGER = Logger.getLogger(VariableScopes.class.getName());

    // class variables => They are defined as variables declared outside any class method

    private int  noOfMatchesPlayed = 3;
    
   public void simpleMethods() {
    LOGGER.info("Simple method output" + noOfMatchesPlayed);
   }

    public void complexMethods() {
    LOGGER.info("complex method output" + noOfMatchesPlayed);
    // int static age = 10;  // cannot use  static inside a method
   }

   public int addTwoNumbers(int a, int b) { // method variable scope => Variables defined as parameters and variables 
    //  declared in the outermost part of the method.  Are available as long as the method is executing
    int result = a + b;
    for (int i = 0; i < 5; i++) {   // i - only accessible in this code block
       LOGGER.info("method output: " + i);
    }

     return result;
   }
    
    public static void main(String[] args) {
        VariableScopes app = new VariableScopes();
        app.simpleMethods();
        app.complexMethods();

        LOGGER.info("main  method output");
        // System.out.print((noOfMatchesPlayed)); //!  Error  - Cannot make a static reference to the non-static field noOfMatchesPlayed.
        System.out.print((app.noOfMatchesPlayed)); // ! solution - we have to make use of the app instance to access it 
    }
}
