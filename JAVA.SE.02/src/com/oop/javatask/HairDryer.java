package com.oop.javatask;

/**
 * Created by IPermyakova on 01.05.2017.
 */
public class HairDryer extends HomeAppliance {
    private int speed;
    public HairDryer(String colour, String material, int wattage, int speed) {
        super(colour, material, wattage);
        this.speed = speed;
    }

    public String toString() {
        return super.toString()
                + ", speed=" + speed;
    }
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        HairDryer other = (HairDryer) otherObject;
        return speed == other.speed;
    }
    public int hashCode() {
        return super.hashCode() + 17 * new Integer(speed).hashCode();
    }
}
