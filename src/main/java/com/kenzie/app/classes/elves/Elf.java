package com.kenzie.app.classes.elves;

public class Elf {

    static final String FIRST_ORIGIN = "Beleriand";
    static final String SECOND_ORIGIN = "middle earth";

    // some elves from beleriand
    // some else from middle earth


    // shared between all
    static final Double LIFESPAN = Double.POSITIVE_INFINITY;
    static final boolean HAS_ATTITUDE = true;
    static final String EARS = "on point";

    // instance variables
    protected String name;
    protected String age;
    String[] familyMembers;

    public Elf(String name, String age, ORIGIN location, AGE ageBorn) {
        this.name = name;
        this.age = age;
    }

}
