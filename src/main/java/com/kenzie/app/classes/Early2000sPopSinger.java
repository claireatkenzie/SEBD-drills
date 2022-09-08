package com.kenzie.app.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Early2000sPopSinger {
    String name;
    String dna;
    String channel;
    String hair;
    ArrayList<String> groups = new ArrayList<>(); // hannah montana -> miley cyrus
    HashMap<String, Integer> cdSales = new HashMap<>();

    @Override
    public boolean equals(Object incomingText) {

        // Self reflection moment, "am i me??!?!"
        if (this == incomingText) {
            return true;
        }

        // Null or classes not matchy matchy
        if (incomingText == null || getClass() != incomingText.getClass()) {
            return false;
        }

        // Hard cast
        Early2000sPopSinger that = (Early2000sPopSinger) incomingText;

        return Objects.equals(this.dna, that.dna);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dna);
    }

}
