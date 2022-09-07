package com.kenzie.app;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class WhichDataStructureTest {

    /**************************************************************************************
     * Write a test that ensures that the data structure contains all days of the week
     * MONDAY TUESDAY WEDNESDAY THURSDAY FRIDAY SATURDAY SUNDAY
    ***************************************************************************************/
    @Test
    void testWeek() {
        // Arrange
        // Act
        // Assert
    }

    @Test
    void testAlarmTime() {
        // Arrange
        HashMap<String, Integer> expectedData = new HashMap<>();
        expectedData.put("MONDAY", 6);
        expectedData.put("TUESDAY", 7);
        expectedData.put("WEDNESDAY", 8);
        expectedData.put("THURSDAY", 7);
        expectedData.put("FRIDAY", 9);
        expectedData.put("SATURDAY", 2);
        expectedData.put("SUNDAY", 10);


        // Act - what should this call be?
        HashMap<String, Integer> actual = null;

        // Assert
        for(Map.Entry<String, Integer> day : expectedData.entrySet()) {
            String key = day.getKey();
            Integer expectedValue = day.getValue();
            Integer actualValue = actual.get(key);
            assert(expectedValue.equals(actualValue));
        }

    }


    /**************************************************************************************
     * Write a test that asserts Monday return an alarm time of 6
     ***************************************************************************************/
    @Test
    void testLookUpAlarm() {
    }
}
