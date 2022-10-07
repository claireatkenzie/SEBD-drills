package com.kenzie.app.classes.singletons;


public class SingletonPattern {

    // 1 private ONE instance that gets used by the entire code base
    private static SingletonPattern instance;

    // 2 private constructor
    private SingletonPattern() {
    }

    // 3 getInstance method to return the one true source
    public static SingletonPattern getInstance(){
        if(instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

    // 4 Methods forever
    public void doSomething (String message) {

    }

    public int doAnotherThing() {
       return -1;
    }

    private boolean whateverThing() {
        return true;
    }
}
