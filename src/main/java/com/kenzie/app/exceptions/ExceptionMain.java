package com.kenzie.app.exceptions;

public class ExceptionMain {

    public static void main(String[] args) {
       try {
           // attempt
           // attempt
           // attempt
       } catch (Exception e) {
           // fail
       }
    }

    public static void one() {
        try {
            System.out.println("Try");
            System.out.println("Try");
            throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("Failed!");
        }
    }

    public static void two() {
        // doing 120 operations
        throw new IllegalArgumentException();
    }

    public static void three() {
        try {
            System.out.println("Try");
            two();
            System.out.println("Try");
        } catch (Exception e) {
            System.out.println("Failed!");
        }
    }


    public static void four() {
        try {
            one(); // very specific exception IndexOutOfBounds
            two(); // very specific exception IllegalArgument
            three(); // very specific CustomException
        } catch (IndexOutOfBoundsException e) {
            // empty == BAD :(
        }
    }
    // we get all of the output from the call to one()
    // two() triggers the catch block
}
