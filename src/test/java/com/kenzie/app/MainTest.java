package com.kenzie.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void runMainWithoutCrashing() {
        boolean crashed = false;
        try {
            Main.main(new String[]{});
        } catch (Exception e) {
            crashed = true;
        }

        assertEquals(false, crashed, "App can run without crashing") ;
    }

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setTestInput() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test_NameChange(){
        Main.main(new String[]{});
        assertTrue(!outContent.toString().contains("YOUR NAME HERE"),"`YOUR NAME HERE` needs to be replaced");
    }

    @Test
    public void test_NameNotEmpty(){
        Main.main(new String[]{});
        assertTrue(outContent.toString().matches(".*\\r?\\n?My name is [a-zA-Z0-9 !]+\\r?\\n?"),"A name must be added after 'My name is'");
    }
}
