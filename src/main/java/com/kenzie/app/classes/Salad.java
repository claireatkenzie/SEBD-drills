package com.kenzie.app.classes;


import java.util.ArrayList;

public class Salad {
    public String base;
    public ArrayList<String> toppings;
    public String dressing;
    public int cupsOfDressing = 1;

    public Salad(String base, ArrayList<String> toppings, String dressing) {
        this.base = base;
        this.toppings = toppings;
        this.dressing = dressing;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String getDressing() {
        return dressing;
    }

    public void addDressing(String dressing) {
        this.dressing = dressing;
        this.cupsOfDressing += 1;
    }

    public int getCupsOfDressing() {
        return this.cupsOfDressing;
    }
}
