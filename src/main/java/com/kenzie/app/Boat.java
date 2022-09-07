package com.kenzie.app;

import java.util.ArrayList;

public class Boat {
    private boolean isFloating = true;
    private boolean isAtPort = true;
    private ArrayList<String> passengers = new ArrayList<>();

    public Boat() {

    }

    // Only want to take in the 2 boolean arguments
    public Boat(boolean isFloating,
                boolean isAtPort) {
        this.isFloating = isFloating;
        this.isAtPort = isAtPort;
    }

    public Boat(boolean incomingIsFloating,
                boolean incomingIsAtPort,
                ArrayList<String> incomingPassengers) {
        this.isFloating = incomingIsFloating;
        this.isAtPort = incomingIsAtPort;

        this.passengers.addAll(incomingPassengers); // This will add all incoming passengers to the boat
    }

    public boolean isFloating() {
        // READ THIS!!!
        return isFloating;
    }

    public void setFloating(boolean floating) {
        // READ THIS!!!
        isFloating = floating;
    }

    public boolean isAtPort() {
        // READ THIS!!!
        return isAtPort;
    }

    public void setAtPort(boolean atPort) {
        // READ THIS!!!
        isAtPort = atPort;
    }

    public ArrayList<String> getPassengers() {
        // READ THIS!!!
        return passengers;
    }

    public boolean setPassengers(ArrayList<String> passengers) {

        // number of passengers cannot exceed capacity
        // correct amount of lifeboats :( jack
        int capacity = 300;
        boolean result;

        if(!this.isFloating) {
            // NO passengers added
            result = false;
        } else if(this.passengers.size() + passengers.size() > capacity) {
            // Add the passengers
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
