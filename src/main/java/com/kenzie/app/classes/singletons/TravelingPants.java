package com.kenzie.app.classes.singletons;

public class TravelingPants {
    // 1. private instance
    private static TravelingPants instance = new TravelingPants();

    // 2. private constructor
    private TravelingPants() {

    }

    // 3. getter for the private instance
    public static TravelingPants getInstance(String name) {
        if(name.equals("Blake") || name.equals("America")) {
            return instance;
        } else {
            System.out.println("no pants for you");
            return null;
        }
    }

    // 4. Any methods that we want
    public boolean putOnPants() {
        return true;
    }

    public String haveAdventure() {
        return "wow so much fun";
    }
}
