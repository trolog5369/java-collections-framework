package com.pranav.collections.arrays;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        // To craete the arrays

        // DataType then[] then array name=new datatype[]
        // [] -> means its an arrays and the value inside it is the size of the array

        // WE have created an array of size 5
        String [] colors=new String[5];

        // in order for us to add elements in the arrays
        colors[0]="purple";
        colors[1]="blue";

        // if we want to see contents of the arrys
        System.out.println(colors);
        // This will return a [Ljava.lang.String;@7ad041f3 random String 

        // to see the content we have to use the toString method
        System.out.println(Arrays.toString(colors));
        // [purple, blue, null, null, null] expected output

        // If we wanted to get the element at specific index
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);
        // System.out.println(colors[5]);//index 5 do not exits as its starts from 0 hence 0 to 4 is 5
        // This line will give an ArrayIndexOfBoundException 

        // If we rewrite the element in the pre-existing index then its gets overriden 
        colors[0]="green";
        // pruple gets overridden as green
        System.out.println(colors[0]);

        // If we know the size of an array we can use this instaead of manually assigning them
        // int [] numbers=new int[2];
        // numbers[0]=100;
        // numbers[1]=200;

        // This is more convinent and fast
        int [] numbers={100,200};
        System.out.println(Arrays.toString(numbers));

        // ONCE WE DEFINE THE ARRAY WE NO LONGER CAN CHANGE THE SIZE

        // Looping thr arrays
        // For loop
        for(int i=0;i<colors.length;i++){
            System.out.println(colors[i]);
        }

        // If we want to have this loop in reverse we can do
        for (int i = colors.length-1; i >=0; i--) {
            System.out.println(colors[i]);
        }
        // as index starts from 0 hence colors.length-1

        // To get the length of an array use the length methods
        System.out.println(colors.length);

        // Enhance for loop
        for(String colour:colors){
            System.out.println(colour);
        }

        // Using streams
        Arrays.stream(colors).forEach(System.out::println);
    }
}
