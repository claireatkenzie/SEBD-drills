package com.kenzie.app.classes.singletons;


// @Singleton
public class Clock {
    // 1 ONE instance used by the entire codebase
    private static Clock instance = new Clock();
    private int easternTime;

    // 2 Constructor
    private Clock() {

    }

    // 3
    public static Clock getInstance() {
        return instance;
    }

    // 4
    public int getLocalTime(Timezone zone) {

        return this.easternTime - zone.timeOffset;
    }

    public enum Timezone {
        MOUNTAIN(-2, "claire"), // -2
        CENTRAL(-1, "stephen"), // -1
        EASTERN(0, "canvas"), // -0
        PACIFIC(-3, "anthony"); // -3

        int timeOffset = 0;
        String whoDis;

        Timezone(int hours, String whoLives) {
            this.timeOffset = hours;
            this.whoDis = whoLives;
        }

        public int convertToUTC() {
            return timeOffset + 9;
        }

        private void calculate() {
            System.out.println(" wow calculations");
        }
    }
}



// Mountain
// Central
// Eastern
// Pacific
