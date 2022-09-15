package com.kenzie.app.classes.cartoons;

public class Caillou extends Cartoon {
    static final boolean CALLIOU_IS_ANNOYING = true;

    public Caillou(int airTime) {
        // finding a constructor that takes 1 integer
       super(airTime);
    }

    public Caillou() {
        super();
        System.out.println("Opening Credits");
    }
}
