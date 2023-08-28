package com.systechafrica.controlFlow;


import java.util.logging.Logger;





public class ControlFlow {
     private static final Logger LOGGER = Logger.getLogger(ControlFlow.class.getName());

     public void ifElseStatements() {
          int maths = 70;
          char grade;

        if(maths >= 70) {
            grade = 'A';
        } else if( maths >= 60) {
            grade = 'B';
        } else if( maths >= 50) {
            grade = 'C';
        } else if(maths >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        LOGGER.info("Your grade is: " + grade);

     }

     public void switchStatement() {
        String day = "SUNDAY";
        switch(day) {
            case "MONDAY":
                LOGGER.info("Monday");
                break;
           case "TUESDAY":
                LOGGER.info("Tuesday");
                break;
            case "WEDNESDAY":
                LOGGER.info("Wednesday");
                break;
           case "THURSDAY":
                LOGGER.info("Thursday");
                break;
            case "FRIDAY":
                LOGGER.info("Friday");
                break;
           case "SATURDAY":
           case "SUNDAY":
                LOGGER.info("Sherehe");
                break;
            default:
                LOGGER.info("Enter A Valid Day");
        }


     }
   
   
   
   
   
     public static void main(String[] args) {
       ControlFlow app = new ControlFlow();
        
       app.ifElseStatements();
       app.switchStatement();
     }
    
}
