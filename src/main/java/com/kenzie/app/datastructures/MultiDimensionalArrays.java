package com.kenzie.app.datastructures;

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        // TODO use main here to test your methods
    }

    // Goal - find the start and stop conditions of 2D array for loops
    public static void printEachCell() {

        // A 2D array can also be called a "matrix" (not Neo's matrix, but a grid)
        Integer[][] matrix = {
                {0,1,2,3},
                {4,5,6,7},
                {8,9,0,1},
                {2,3,4,5}
        };

        // Write 2 nested for loops using the following format
        // To print each "grid" item in order

        // TODO what should these two values be?
        int stopI = 0;
        int stopJ = 0;

        // TODO print this array. What do you notice about the order?
        for (int i = 0; i < stopI; i++) {
            for (int j = 0; j < stopJ; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    // Goal - Find the start and stop condition of 2D arrays
    // Goal - Understand how swapping the i and j indexes
    //        alters the order the matrix is processed
    public static void printEachCellBackwards() {
        Integer[][] matrix = {
                {0,1,2,3},
                {4,5,6,7},
                {8,9,0,1},
                {2,3,4,5}
        };

        // Write 2 nested for loops using the following format
        // To print each "grid" item in order

        // TODO what should these two values be?
        int stopI = 0;
        int stopJ = 0;

        // TODO Print the matrix *backwards*
        for (int i = 0; i < stopI; i++) {
            for (int j = 0; j < stopJ; j++) {
                // TODO System.out.println(matrix[ ???? ][ ???? ]);
            }
        }
    }


    // Goal - Write a method that prints any incoming 2D array of Objects
    // Goal - Understand that an Object[][] parameter can take any 2D array of Objects (String, Integer, Boolean, etc)
    public static void printMatrix(Object[][] incoming) {
        /* the pseudocode will look something like this...
            forloop {
                forloop {
                    print statement
                }
            }
        */
    }

    // Goal - Iterate through a 2D array using for-each loops
    // Goal - Convert from string to integer
    public static void multiplyEachCellByTwo() {
        String[] row1 = {"1", "2", "3"};
        String[] row2 = {"11", "22", "33"};
        String[] row3 = {"111", "222", "333"};
        String[] row4 = {"1111", "2222", "3333"};

        String[][] matrix = {
                row1,
                row2,
                row3,
                row4
        };

        // Print the *integer* value of each item in matrix multiplied by 2
        // You will use a call to Integer.parseInt(input)

        for (String[] row :matrix ) {
            for(String value : row ) {
                // TODO print integer value multiplied by 2
            }
        }
    }

    // Goal - Iterate over a 2D array
    // Goal - Convert an integer into its "word" value using a lookup array
    // Goal - Use a method to print your 2D array
    public static void convert() {

        Integer[][] matrix = {
                {0,1,2,3},
                {4,5,6,7},
                {8,9,0,1},
                {2,3,4,5}
        };

        // TODO Convert the following 2D int matrix into a matrix of words
        // ex 1 turns into "one"
        //    2 turns into "two"
        //    3 turns into "three"

        // Consider using a data structure like the following
        // TODO You will need to add additional items to this lookup array
        String[] lookup = {"zero", "one", "two", "three"};

        // The result should be the following
        // {zero, one, two, three}
        // {four, five, six, seven}
        // ... and so on

        // TODO Store this new String[][] resultMatrix
        String[][] resultMatrix = {};

        // Use your printMatrix(resultMatrix) method above

    }
}
