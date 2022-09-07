package com.kenzie.app.methods;

// Goal - Refactor a large method into 3 smaller ones

// Instructions
// You will be breaking apart code from originalCode()
// You might not know how lists, hashmaps and streams work - ignore them! Just reorganize the code
// Sort the original code into 3 chunks. COPY (don't cut!!) code into the matching method
// At the end, the output of both the old and new code should match
// Don't change anything in run()

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MethodRefactoring {

    public static HashMap<String, Integer> DIGITS = new HashMap<>() {{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
    }};

    /**********************************************
     * Original method - this might be unfamiliar or scary, it's ok!
     * Don't worry about what the code is, just refactor it
     * COPY code from here don't cut!!
     * Organize into the 3 methods below
     * Do not delete code from this method
     ************************************************/

    public static String originalCode(String  a, String  b, String  c, String  d, String  e, String  f) {

        // Convert to integers
        String[] args = {a,b,c,d,e,f};
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < args.length; i++) {
            String stringNumber = args[i];
            int value = 1;

            if(stringNumber.contains("negative")) {
                value *= -1;
            }

            value = value * DIGITS.get(stringNumber);

            numbers.add(value);
        }


        // Remove negative numbers
        for(int number : numbers) {
            if(number < 0) {
                numbers.remove(number);
            }
        }

        // Print the sum

        String printable = numbers.stream().map(n -> "Number - " + d).collect(Collectors.joining(","));
        System.out.println(printable);
        return printable;
    }



    /**********************************************
     * New Methods
     * Organize code from above into these
    ************************************************/

    public static ArrayList<Integer> math(String  a, String  b, String  c, String  d, String  e, String  f) {
        return null;
    }

    public static ArrayList<Integer> sanitize(ArrayList<Integer> input) {
        return null;
    }

    public static String format(ArrayList<Integer> input) {
        return null;
    }

    /**********************************************
     * Run!
     * Don't change these calls
     * Confirm that original matches method-ized output
     ************************************************/
    public static void main(String[] args) {

        String original = originalCode("seven", "eight", "nine", "negative one", "nine", "one");

        ArrayList<Integer> step1 =math("seven", "eight", "nine", "negative one", "nine", "one");
        ArrayList<Integer> step2 = sanitize(step1);
        String methodized = format(step2);

        if(!original.equals(methodized)) {
            System.out.println("Differences!");
            System.out.println(original);
            System.out.println(methodized);
        } else {
            System.out.println("Matches!");
        }
    }
}
