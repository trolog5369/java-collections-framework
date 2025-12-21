package com.pranav.collections.arrays.arrays2d;

import java.util.Arrays;

public class WokringWith2DArrays {
    public static void main(String[] args) {
        // in arrays we only have 1 [] brackets and in case of 2D array we have 2 []

        char [][] board=new char[3][3];
        // we have created the 2D array of 3X3 cells

        for (int i = 0; i < 3; i++) {
            for(int j=0 ; j< 3 ;j++){
                board[i][j]='-';
            }
        }

        // we use 2 for loops beacuse we had 2D arrays

        // To print the 2D Array we used deepToString() instead of ToString
        System.out.println(Arrays.deepToString(board));
        // [[-, -, -], [-, -, -], [-, -, -]]

        // Think of 2DArray as 
        /*
           0,0  0,1  0,2
           1,0  1,1  1,2
           2,0  2,1  2,2 */
        // This is an example of 3X3 2D array/Matrix

        // if we want to change the cell at 0,0
        board[0][0]='0';
        board[1][0]='0';
        board[2][0]='0';
        System.out.println(Arrays.deepToString(board));
        // [[0, -, -], [0, -, -], [0, -, -]]

        // 2D Array works exactly the same way as Arrays just the looping is different

        // if we want to in-line create the array we can do this
        char[][] boardTwo=new char[][]{
            new char[]{'0','-','-'},
            new char[]{'0','-','-'},
            new char[]{'0','-','-'},
        };

        System.out.println(Arrays.deepToString(boardTwo));
        // [[0, -, -], [0, -, -], [0, -, -]]

        // Anytime we want to have grid use 2D Array

    }
}
