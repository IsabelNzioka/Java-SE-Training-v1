package com.systechafrica.part3.logging;

import java.io.IOException;
// import java.util.logging.FileHandler;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
// import java.util.logging.Formatter;
// import java.util.logging.Logger;
import java.util.logging.*;

public class FileLogging {
    private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        FileHandler fileHandler = new FileHandler("log.txt", true);

        CustomFormatter formatter = new CustomFormatter();
       
        LOGGER.addHandler(fileHandler);
        fileHandler.setFormatter(formatter);

        LOGGER.info("Info message Logging\n");
        LOGGER.severe("Error message logging\n");
        LOGGER.warning("Warning message Logging\n");

        test();
    }

    public static void test() {
        LOGGER.info("Info message Logging test\n");
        LOGGER.severe("Error message logging test\n");
        LOGGER.warning("Warning message Logging test\n"); 
    }

    // static class CustomeFormatter extends Formatter {
    //     @Override
    //     public String format(LogRecord record) {
    //         DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    //         // LocalDateTime now = LocalDateTime.now();

    //         String method = record.getSourceMethodName();
    //         String level = record.getLevel().getName();
    //         String message = record.getMessage();

    //         Instant instant = record.getInstant();
    //         LocalDateTime now = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    //         return pattern.format(now) + " | " + method + " | " + level + " | " + message;
    //     }
        
    // }
    
}
