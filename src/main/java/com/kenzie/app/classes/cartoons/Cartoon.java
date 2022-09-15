package com.kenzie.app.classes.cartoons;

public class Cartoon {
    String[] characters;

    boolean july22LikesIt;
    boolean playsOnTV;
    boolean isHealthy;

    int year;
    int channel;

    public Cartoon() {
        System.out.println("Cartoon airs at 7 central");
    }

    public Cartoon(int time) {
        System.out.println("Cartoon airs at " + time + "central");
    }

    public String[] getCharacters() {
        return characters;
    }

    public void setCharacters(String[] characters) {
        this.characters = characters;
    }


    public boolean isHealthy() {
        return this.isHealthy;
    }

    // ISJuly22
    // GETJul22
    public boolean isJuly22LikesIt() {
        return july22LikesIt;
    }

    public void setJuly22LikesIt(boolean july22LikesIt) {
        this.july22LikesIt = july22LikesIt;
    }

    public boolean isPlaysOnTV() {
        return playsOnTV;
    }

    public void setPlaysOnTV(boolean playsOnTV) {
        this.playsOnTV = playsOnTV;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}
