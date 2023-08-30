package com.systechafrica.stringClass;

import java.util.logging.Logger;

public class StringClass {
private static final Logger LOGGER = Logger.getLogger(StringClass.class.getName());
  
   

    public void stringObjects() {
         // ! STRINGS ARE IMMUTABLE - ONCE CEATED THEY CANNOT BE MODIFIED
        // ! UNLESS THEY ARE REASSIGNED AGAIN

        String message = "Hello";
        message.concat("World"); //no effect
        LOGGER.info(message);

        // reassigning
        message = message.concat("Programmer!");
        LOGGER.info(message);

        // ////////////////////////////
        // ? CONCATENATION
        String firstName = "Isabel";
        String lastName = "Nzioka";
        String fullName = firstName + " " + lastName;
        LOGGER.info((fullName ));

        // ? SUBSTRING EXTRACTION
        String sentence = "I love Java programming";
        String substring = sentence.substring(2, 6);
        LOGGER.info(substring); //love 



        // ? STRING  COMPARISON  - equals
        String str1 = "Hello";
        String str2 = "hello";
        boolean isEqual = str1.equals(str2);
        boolean isSameIgnoringCase = str1.equals(str2);
        System.out.print(isEqual); //false
        System.out.println(isSameIgnoringCase); //true


        // ?      STRING COMPARISON - ==
        String string1 = "Hello";
        String string2 = "Hello";
        boolean areSame = (string1 == string2); //true (bothe refer to the same object in the pool)
        // == checks if the two strings referenced pint to the same memory location.

        // ?       == VS equals()
        String greeting = "Hello";
        String anotherGreeting = new String("Hello");
        boolean greetingsAreSame = (greeting == anotherGreeting); // false (different string objects)
        boolean greetingsAreEqual = greeting.equals(anotherGreeting); // true ( contents are the same)


        // ?     STRING MODIFICATION
        String strToModify = "Hello, World!";
        String uppercase = strToModify.toUpperCase();
        String lowecase = uppercase.toLowerCase();
        String replace = strToModify.replace("Hello", "Hi");
        System.out.println("Uppercase: " + uppercase + " Lowecase: " + lowecase + " replaced " + replace);


        String str3 = "Java Program";
        String str4 = str1.replace('a', 'z');

        System.out.println(str1);
        System.out.println(str2);

        String str5 = "Java course";
        System.out.println(str3.compareTo(str5));  //-19  - the difference btwn the ASCII code


    
        


    }

    public static void main(String[] args) {
        StringClass app = new StringClass();

     
        app.stringObjects();
    }
    
}
