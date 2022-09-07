package com.kenzie.app;

import java.util.ArrayList;


// class member anything in the class
// instance variables
// instance methods

// Salad()
// Salad(String 1, ArrayList 2, String 3)
// Salad( String String String) // not found!

public class Salad {
    private String base;
    private ArrayList<String> toppings;
    private String dressing;

    // Constructor
    // accessor word (public/private)
    // class name
    // THAT IS IT

    // Overloading methods/constructors
    // Same name, different number of parameters
    public Salad() {

    }

    public Salad(String base, ArrayList<String> toppings, String dressing) {
        // what would the code look like to update these values
        this.base = base;

        this.toppings = new ArrayList<>();
        this.toppings.addAll(toppings);

        this.dressing = dressing;
    }

    public Salad(String incomingBase) {
        this.base = incomingBase;
        this.toppings = new ArrayList<>();
        this.dressing = "";
    }

    // setters return nothing
    // getters return the data type of the class member

}
