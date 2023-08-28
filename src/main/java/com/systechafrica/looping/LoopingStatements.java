package com.systechafrica.looping;

import java.util.logging.Logger;





public class LoopingStatements {
    private static final Logger LOGGER = Logger.getLogger(LoopingStatements.class.getName());

    public void forLoop() {
        // initialize, condition, update
        // int counter = 0; //initialization
        for(int counter = 0; counter <= 10; counter++) {
            LOGGER.info("Count = " + counter);
        }

         for(int counter = 10; counter > 0; counter--) {
            LOGGER.info("Count = " + counter);
        }
    }

    public void whileLoops() {
        int studentCount = 0;
        int counter = 10;


         while(studentCount < 10) {
            LOGGER.info("Student Count WhileLoops: " + studentCount);
            studentCount++;
        }
        while(counter > 0) {
            LOGGER.info("Counter WhileLoops: " + counter);
            counter--;
        }
    }


    public void doWhile() {
        int count = 3;
        do {
            LOGGER.info("Hello Java Queen");
            count--;
        } while (count > 0);
        
    }

      public static void main(String[] args) {
       LoopingStatements app = new LoopingStatements();
       app.forLoop();
       app.whileLoops();
       app.doWhile();
        
     
     }
    
}
