package com.systechafrica.arrays;

import java.util.logging.Logger;



public class WorkingWithArrays {
    private static final Logger LOGGER = Logger.getLogger(WorkingWithArrays.class.getName());

    public void workingWithArrays() {

    int[] arr1 = {1, 2, 3, 4, 5};
    for(int e = 0; e < arr1.length; e+=2) {
        System.out.println(arr1[e]);
    }

    }

    public void multiDimensionalArray() {
        int[][] matrix  = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int length = matrix.length;

        int[][] matrix2 = new int[3][3]; //? indicates a multi dimension array with length of 3
        // int[][] matrix3 = new int[3][3]; //? indicates a multi dimension array with length of 3 and individual arrays of length 3
        // String[][] matrix4 = new String[3][3];
        // int[][] matrix5;
        // matrix5 = new int[5][];
        matrix2[0][0] = 10;
        matrix2[0][1] = 15;

        matrix2[1][2] = 15;
        matrix2[2][0] = 20;
          matrix2[2][2] = 30;



        // length of multidimentional array we use the count the number of elemnts in the parent array.
        for(int i = 0; i < matrix2.length; i++) {
            for(int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        WorkingWithArrays app = new WorkingWithArrays();
        app.workingWithArrays();
        app.multiDimensionalArray();

    }
    
}
