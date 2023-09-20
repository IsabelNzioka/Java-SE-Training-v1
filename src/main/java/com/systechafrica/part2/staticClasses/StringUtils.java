package com.systechafrica.part2.staticClasses;

public class StringUtils {
//utility methods in a single class - improves code maintability and makes it easier to locate and use the methods 
    public static boolean isNullOrEmpty(String s) {
        return s == null || isNullOrEmpty(s);
    }

    public static boolean isNull(String s) {
        return s == null;
    }

    public static boolean isEmpty(String s) {
        return s.isEmpty();
    }

    public static int length(String s ) {
        return s.length();
    }
    
}
