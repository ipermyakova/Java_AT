package com.oop.javatask;

/**
 * Created by IPermyakova on 01.05.2017.
 */
public class Kettle extends HomeAppliance {
    private double capacity;
    public Kettle(String colour, String material, int wattage, double capacity) {
        super(colour, material, wattage);
        this.capacity = capacity;
    }

    public String toString() {
        return super.toString()
                + ", capacity=" + capacity + " litre";
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Kettle other = (Kettle) otherObject;
        return capacity == other.capacity;
    }
    public int hashCode() {
        return super.hashCode() + 17 * new Double(capacity).hashCode();
    }
}
