package com.kenzie.app.classes.singletons;

// Hall Pass
public class SingletonPattern {

    // 1. Hall Pass behind the teacher's desk
    private static SingletonPattern instance;

    // ONLY the teacher can create the hall pass
    // Students cannot forge one
    // RFID
    private SingletonPattern() {
        // Initialize stuff
    }


    // 3. Teacher literally giving out the hallpass at the teacher's discretion
    public static SingletonPattern getInstance(){
        if(instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

    // 4. Regular methods
    // Walk down hall
    // Validate hall pass
    // loseHallPass
    public void doSomething (String message) {

    }
}
