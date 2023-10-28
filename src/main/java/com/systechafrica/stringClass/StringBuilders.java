package com.systechafrica.stringClass;

import java.util.logging.Logger;


public class StringBuilders {

    private static final Logger LOGGER = Logger.getLogger(StringBuilders.class.getName());

    public static void main(String[] args) {

        //?   MUTABLE REQUENCE OF CHARACTERS
        //? ALLOWING EFFICIENT STRING MANIPULATION OPERATIONS

        // *APPENDING TEXT
        StringBuilder sb = new StringBuilder(100);  //capacity -not the number of characters

        String str = " ";
        boolean equals = str.equals(sb.toString());
        LOGGER.info(" " + equals);


        StringBuilder name = new StringBuilder();
        name.append("Isabel\n");
        name.append("Nzioka");
        System.out.println(name);


        StringBuilder str1 = new StringBuilder(5);
        String str2 = "";


        if (str1.equals(str2)) {
            System.out.println("Match 1");
        } else if (str1.toString().equals(str2.toString())) {
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }


        //    if (str1.toString().equals(str2)) {
        //        System.out.println("Match 1");
        //    } else {
        //        System.out.println("No Match 1");
        //    }

        //    if (str1.toString().equals(str2.toString())) {
        //        System.out.println("Match 2");
        //    } else {
        //        System.out.println("No Match 2");
        //    }
    }


}
