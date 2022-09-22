package com.kenzie.app.classes.singletons;

public class JavaSchoolClassroom {

    public static void main(String[] args) {
        String request = "I need a drink of water can I have a hallpass";

        Bathroom claireAtDoor = Bathroom.getInstance();
        Bathroom mitchAtDoor = Bathroom.getInstance();


        mitchAtDoor.checkDoor();

        claireAtDoor.lockDoor();
        mitchAtDoor.lockDoor();
    }
}
