package com.kenzie.app.classes.singletons;

// @Singleton
public class Bathroom {

    //  1. instance that is private
    private static Bathroom instance = new Bathroom();
    private boolean isLocked = false;
    private int numberOfConnections = 4;
    private boolean isClean = true;
    private int numberOfTowels = 4;


    //  2. private constructor
    private Bathroom() {

    }

    //  3. getInstance method (public)
    public static Bathroom getInstance() {
        return instance;
    }


    //  4. whatever you want method YOLO
    public void lockDoor() {
        this.isLocked = true;
    }

    public void unlockDoor() {
        this.isLocked = false;
    }

    public boolean checkDoor() {
        return this.isLocked;
    }

    public boolean makeConnection() {

    }


}
