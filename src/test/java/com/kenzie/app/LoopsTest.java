package com.kenzie.app;

import com.kenzie.app.loopslists.Loops;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoopsTest {

    @Test
    void forLoop0() {
        assertEquals(Loops.forLoop0(),
                "C  L  A  I  R  E     K  Y  L  E     K  E  L  L  I     Z  A  C  K     J  O  E  Y     J  O  R  D  A  N  ");
    }

    @Test
    void forLoop1() {
        assertEquals(Loops.forLoop1(), "1-6-8-2-10");
    }

    @Test
    void forLoop2() {
        assertEquals(Loops.forLoop2(), -8);
    }

    @Test
    void whileLoop0() {
        assertTrue(Loops.whileLoop0() < 30);
    }

    @Test
    void whileLoop1() {
        assertEquals(Loops.whileLoop1(), " Please Thanks Please Thanks Please Thanks Please Thanks Please Thanks");
    }

    @Test
    void whileLoop2() {
        assertEquals(Loops.whileLoop2(),
                "Never gonna give you up"+
                "Never gonna let you down"+
                "Never gonna run around and desert you"+
                "Never gonna make you cry"+
                "Never gonna say goodbye"+
                "Never gonna tell a lie and hurt you");
    }

    @Test
    void convert0() {
        assertEquals("CLAIRE KYLE KELLI ZACK JOEY JORDAN",
                Loops.convert0());
    }

    @Test
    void convert1() {
        assertEquals("claireclairekylekylekellikellizackzackjoeyjoeyjordanjordan",
                Loops.convert1());
    }

    @Test
    void convert2() {
        assertEquals(4,
                Loops.convert2());
    }
}

