package com.kenzie.app.classes.elves;

public class Main {

    static boolean IS_AT_WAR = false;
    static final String SETTING = "Middle Earth";

    public static void main(String[] args) {

        IS_AT_WAR = true;

        System.out.println(Elf.LIFESPAN);

        Elf galadriel = new Elf(
                "Galadriel",
                "infinity",
                ORIGIN.VALINOR,
                AGE.OLD_AF
        );
        IS_AT_WAR = false;

        Elf babyElf = new Elf(
                "bebe",
                "1",
                ORIGIN.MIDDLE_EARTH,
                AGE.FOURTH);

        IS_AT_WAR = true;
    }
}

enum ORIGIN {
    VALINOR, MIDDLE_EARTH
}

enum AGE {
    FIRST, SECOND, THIRD, FOURTH, OLD_AF
}
