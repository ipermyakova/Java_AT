package com.oop.javatask;

/**
 * Created by IPermyakova on 01.05.2017.
 */
public class CofferMashines extends HomeAppliance {
    private double waterTank;

    public CofferMashines(String colour, String material, int wattage, double waterTank) {
        super(colour, material, wattage);
        this.waterTank = waterTank;
    }

    public String toString() {
        return super.toString()
                + ", waterTank=" + waterTank + " litre";
    }

    public boolean equals (Object otherObject) {
        if (!super.equals(otherObject)) return false;
        CofferMashines other = (CofferMashines) otherObject;
        return waterTank == other.waterTank;
    }

    public int hashCode() {
        return super.hashCode() + 17 * new Double(waterTank).hashCode();
    }


}
