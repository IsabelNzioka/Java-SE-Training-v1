package com.systechafrica.arrays;

import java.util.logging.Logger;



public class WorkingWithArrays {
    private static final Logger LOGGER = Logger.getLogger(WorkingWithArrays.class.getName());

    public void workingWithArrays() {

    int[] arr1 = {1, 2, 3, 4, 5};
    for(int e = 0; e < arr1.length; e+=2) {
        System.out.print(arr1[e]);
    }

    }


    public static void main(String[] args) {
        WorkingWithArrays app = new WorkingWithArrays();
        app.workingWithArrays();

    }
    
}
