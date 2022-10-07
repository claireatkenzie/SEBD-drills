package com.kenzie.app.classes.singletons;

public class Main {
    public static void main(String[] args) {
        // SingletonPattern singleton = new SingletonPattern();
        SingletonPattern singleton = SingletonPattern.getInstance();

        Clock claireMountainTime = Clock.getInstance();
        claireMountainTime.getLocalTime(Clock.Timezone.MOUNTAIN); // 3:38


        Clock anthonyPacific = Clock.getInstance();
        Clock stephenCentral = Clock.getInstance();
        Clock canvasCourseEastern = Clock.getInstance();

        // adjusting for a local time zone
        // localization

    }
}
