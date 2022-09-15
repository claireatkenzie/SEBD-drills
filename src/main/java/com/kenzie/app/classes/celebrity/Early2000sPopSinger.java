package com.kenzie.app.classes.celebrity;

// child class
public class Early2000sPopSinger extends Celebrity {
    protected String name;
    protected String hairColor;
    protected String age;
    protected String tvShow;
    /*
    We get them automatically
    boolean isActive;
    String recordLabel;
    String[] albums;
     */

    // $$$$$
    public Early2000sPopSinger() {
        // going to the parent class
        // finding a matching constructor
        // that takes no arguments
        // MAGIC
        super();
        System.out.println("disney channel made a TV show about this person");
        System.out.println("they were beloved");
        System.out.println("they were a DJ");
        System.out.println("they have their own perfume brand");

        this.hairColor = "chunky dark/blonde highlights hair glitter";
    }

    public Early2000sPopSinger(String filmGuildName) {
        // going to the parent class (super -- parent)
        // finding a matching constructor
        // that takes a string
        // MAGIC
        super(filmGuildName);
    }

    public Early2000sPopSinger(String filmGuildName, String tvShow) {
        super(filmGuildName);
        this.tvShow = tvShow;
    }
}
