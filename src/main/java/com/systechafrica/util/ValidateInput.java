package com.systechafrica.util;

public class ValidateInput {

    

    public static final boolean validate(String input) {   // ValidateInput.validate(password)  - how to use it in other files
 
    
        if(input != null && input.length() > 0 ) {
            return true;
        }

        return false;
    }

  
    
}
