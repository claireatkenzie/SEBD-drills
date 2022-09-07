package com.kenzie.app.loopslists;

import java.util.Arrays;

public class Loops {
    /**********************************************
     * For Loops
     ************************************************/

    public static String forLoop0() {

        String sentence = "Claire Kyle Kelli Zack Joey Jordan";
        char[] chars = sentence.toCharArray();

        String result = "";

        // Loop over the characters
        // Capitalize each character and add two spaces
        // The result will look like "C  L  A  I  ..."
        // Add it to the variable result

        return result;
    }

    public static String forLoop1() {
        // Write a for loop that converts the following list of ints into a string
        // The result will look like "1-6-8-2-10"
        int[] numbers = {1, 6, 8, 2, 10};
        String result = "";

        return result;
    }

    public static int forLoop2() {
        // Write a for loop that adds only the negative numbers in the array
        // Return the value
        int[] numbers = {2, -5, 8, -2, 9, 1, -1};

        // Replace this line with your answer
        return 0;
    }


    /**********************************************
     * While Loops
     ************************************************/

    public static int whileLoop0() {
        // Make this loop stop when the sum is greater than 30

        int[] numbers = {1, 5, 7, 9, 10, 15, 37, 89};
        int sum = 0;

        int counter = 0;
        while(counter < numbers.length) {
            sum += numbers[counter];
            counter++;
        }

        return sum;
    }

    public static String whileLoop1() {
        // Make this loop stop when there are 5 "Please" in the sentence

        String sentence = "";
        int count = 0;

        while(count < 10) {
            sentence += " Please Thanks";
            count++;
        }

        return sentence;
    }

    public static String whileLoop2() {
        // Write a while loop that concatenates the string array
        String[] sentences = {
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
        };


        return ""; // Replace this with your final sentence
    }

    /**********************************************
     * Convert Loops
     * Convert the while loops to for loops
     * Convert the for loops to while loops
     ************************************************/

    // Convert to For Loop
    public static String convert0() {
        String[] input = new String[]{
                "Claire",
                "Kyle",
                "Kelli",
                "Zack",
                "Joey",
                "Jordan",
        };

        int counter = 0;

        while(counter < input.length) {
            String name = input[counter];
            input[counter] = name.toUpperCase();
            counter++;
        }

        return Arrays.toString(input);
    }

    // Convert to While Loop
    public static String convert1() {
        String[] input = new String[]{
                "Claire",
                "Kyle",
                "Kelli",
                "Zack",
                "Joey",
                "Jordan",
        };

        String output = "";

        for (int i = 0; i < input.length; i++) {
            output += input[i].toLowerCase().repeat(1);
        }

        return output;
    }

    // Convert to For Loop
    public static int convert2() {
        String sentence = "Claire Kyle Kelli Zack Joey Jordan";
        String[] names = sentence.split(" ");

        int countE = 0;
        int index = 0;

        while(countE < 2) {
            if (names[index].toLowerCase().contains("e")) {
                countE++;
            }
            index++;
        }

        System.out.println("Found " + countE + " names with e");
        return countE;
    }

    public static void main(String[] args) {
        forLoop0();
        forLoop1();
        forLoop2();

        whileLoop0();
        whileLoop1();
        whileLoop2();

        convert0();
        convert1();
        convert2();
    }
}
