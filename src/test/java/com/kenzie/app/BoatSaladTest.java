package com.kenzie.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import com.kenzie.app.classes.Boat;
import com.kenzie.app.classes.Salad;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class BoatSaladTest {

    /**********************
     * Boat Tests
     * ********************** */

    @Test
    void addPassenger() {
        // Arrange
        Boat boat = new Boat();

        // Act
        boat.addPassenger("Sally");

        // Assert
        assert(boat.getPassengerList().contains("Sally"));
    }

    @Test
    void addPassengerFullBoat() {
        // Arrange
        Boat boat = new Boat();
        for(int i = 0; i < 299; i++) {
            boat.addPassenger("Passenger " + i);
        }

        // Act
        boolean actual = boat.addPassenger("301 passenger");

        // Assert
        assertFalse(actual);
    }

    /**********************
     * Salad Tests
     * ********************** */

    @Test
    void cannotAddMoreThat2CupsOfDressing() {
        // Arrange
        ArrayList<String> toppings = new ArrayList<>();
        Salad purist = new Salad("greens", toppings, "caesar");
        int expectedNumberOfCups = 2;

        // Act
        purist.addDressing("blue cheese");
        purist.addDressing("blue cheese");
        purist.addDressing("blue cheese");
        purist.addDressing("blue cheese");
        int actualCups = purist.getCupsOfDressing();

        // Assert
        assert(actualCups == expectedNumberOfCups);
    }

    @Test
    void makePuristSalad() {
        // Arrange
        ArrayList<String> toppings = new ArrayList<>();
        toppings.add("crouton");

        // Act
        Salad purist = new Salad("greens", toppings, "caesar");

        // Assert
        assert(purist.base.equals("greens"));
        assert(purist.dressing.equals("caesar"));
        assert(purist.toppings.contains("crouton"));
        assert(purist.toppings.size() == 1);
    }
}
