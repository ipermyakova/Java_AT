package com.oop.javatask;

/**
 * Created by IPermyakova on 01.05.2017.
 */
public class Washer extends HomeAppliance {
    private int capacity;
    private int maxSpinSpeed;

    public Washer(String colour, String material, int power, int capacity, int maxSpinSpeed) {
        super(colour, material, power);
        this.capacity = capacity;
        this.maxSpinSpeed = maxSpinSpeed;
    }
    public String toString() {
        return super.toString()
                + ", capacity=" + capacity + " kg "
                + ", maximum spin speed=" + maxSpinSpeed + " rpm";
    }
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Washer other = (Washer) otherObject;
        return capacity == other.capacity && maxSpinSpeed == other.maxSpinSpeed;
    }

    public int hashCode() {
        return super.hashCode() + 17 * new Integer(capacity).hashCode() + 19 * new Integer(maxSpinSpeed).hashCode();
    }
}
