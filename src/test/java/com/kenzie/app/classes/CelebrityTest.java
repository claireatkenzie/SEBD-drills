package com.kenzie.app.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelebrityTest {

    @Test
    public void testAddMoreThan10Clothing() {
       // Prepare input parameters
        Celebrity hanSolo = new Celebrity();
        
        for(int i = 0; i < 10; i++) {
            hanSolo.addAttire("shirts");
        }

        String item = "socks";

       // Figure out your expected value
        boolean expected = false;

       // Call the method, save your actual
        boolean actual = hanSolo.addAttire(item);

        // Assert that expected equals actual
        assert(actual == expected);
    }

}