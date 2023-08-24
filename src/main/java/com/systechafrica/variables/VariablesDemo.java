
package com.systechafrica.variables;

import java.util.logging.Logger;

public class VariablesDemo {
    private static final Logger LOGGER = Logger.getLogger(VariablesDemo.class.getName());
    public static void main(String[] args) {
        VariablesDemo demo = new VariablesDemo();


     demo.booleanTypes();  
        demo.characterTypes();
       demo.floatingTypes();
        demo.variableDeclarations();
        demo.constantVariables();
        demo.integerTypes();
     
    }

    private void variableDeclarations() {
        //integer variable
        // ? type variableName
        int score = 0;
        LOGGER.info("Score integer variable value is " + score);
    }

        private  void constantVariables() {
         // ? constant variable
        // final type variableName = value;
        final double PI = 3.14159;
        LOGGER.info("Constant variable PI = " + PI);
}


    private void integerTypes() {
       // integer variable
        // ? type variableName
        int score = 99;
        LOGGER.info("Score integer variable value is: " + score);
        LOGGER.info("Integer Minimum "+ Integer.MIN_VALUE);
        LOGGER.info("Integer Maximum "+ Integer.MAX_VALUE);

        LOGGER.info("Long Minimum "+ Long.MIN_VALUE);
        LOGGER.info("Long Minimum "+ Long.MAX_VALUE);
    }

    private void floatingTypes(){
        // float type
        float floatRate = 2.1457454F;
        double doubleRate = 2.1457454;
        LOGGER.info("Float value: " + floatRate);
        LOGGER.info("Double value: " + doubleRate);
        
    }

      private void characterTypes(){
        // character type
       char grade = 'A';
        LOGGER.info("character value: " + grade);  
    }
      private void booleanTypes(){
        // boolean type
       boolean isPromoted = false;
       boolean isProcessed = true;
        LOGGER.info("false value: " + isPromoted);  
         LOGGER.info("true value: " + isProcessed);  
    }
    
    public int add(int a, int b) {
        return a + b;
    }
}
