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

      public static void main(String[] args) {
       LoopingStatements app = new LoopingStatements();
       app.forLoop();
        
     
     }
    
}
