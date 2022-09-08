package com.kenzie.app.classes;

public class Nsync {

    public static void main(String[] args) {

        Early2000sPopSinger hannahMontana = new Early2000sPopSinger();
        hannahMontana.hair = "blonde";
        hannahMontana.dna = "CATAGAGAGCDADDTATATATATA";

        Early2000sPopSinger mileyCyrus = new Early2000sPopSinger();
        mileyCyrus.hair = "brown";
        mileyCyrus.dna = "CATAGAGAGCDADDTATATATATA";

        System.out.println(hannahMontana.equals(mileyCyrus));






    }
}
