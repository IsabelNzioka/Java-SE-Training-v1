package com.systechafrica.controlFlow;

import java.util.logging.Logger;



public class BreakandContinue {

 private static final Logger LOGGER = Logger.getLogger(BreakandContinue.class.getName());


// ! JUMP STATEMENTS

 public void breakStatement() {
     for(int i = 0; i < 10; i++) {
        if(i == 5) {
            break;
        }

        System.out.println("My Index is - BREAK - " + i);
    }
    LOGGER.info("After my loop");

 }

  public void continueStatement() {
    for(int i = 0; i < 10; i++) {
        if(i == 5) {
            continue;
        }

        System.out.println("My Index is - " + i);
    }
    LOGGER.info("After my loop");

 }
    public static void main(String[] args) {

        BreakandContinue app = new BreakandContinue();
        app.breakStatement();
        app.continueStatement();

    }
    
}
