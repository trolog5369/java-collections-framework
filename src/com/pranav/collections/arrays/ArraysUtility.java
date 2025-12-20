package com.pranav.collections.arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        // WE have created an array of size 5
        String [] colors=new String[5];

        // in order for us to add elements in the arrays
        colors[0]="purple";
        colors[1]="blue";
        colors[2]="orange";
        colors[3]="white";
        colors[4]="black";

        System.out.println(Arrays.toString(colors));

        // Arrays have many utility functions for ex:
        // Arrays.toString(args);
        // Arrays.compare(null, null);
        // Arrays.equals();
        // Arrays.binarySearch();
        // Arrays.copyOf():
        // And many more we can access them using the Arrays.  utility method

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }
}
