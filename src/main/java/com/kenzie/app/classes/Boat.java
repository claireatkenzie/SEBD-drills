package com.kenzie.app.classes;

import java.util.ArrayList;
import java.util.List;

public class Boat {
    List<String> passengerList = new ArrayList<>();
    boolean isFloating = true;
    boolean isAtPort = true;

    public List<String> getPassengerList() {
        return passengerList;
    }

    public boolean addPassenger(String passengerName) {
        this.passengerList.add(passengerName);
        return true;
    }

    public boolean isFloating() {
        return isFloating;
    }

    public void setFloating(boolean floating) {
        isFloating = floating;
    }

    public boolean isAtPort() {
        return isAtPort;
    }

    public void setAtPort(boolean atPort) {
        isAtPort = atPort;
    }
}
