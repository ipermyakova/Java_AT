package com.oop.javatask;

/**
 * Created by IPermyakova on 01.05.2017.
 */
public class Mixer extends HomeAppliance {
    private int speed;
    public Mixer(String colour, String material, int power, int speed) {
        super(colour, material, power);
        this.speed = speed;
    }
    public String toString() {
        return super.toString()
                + ", speed=" + speed;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Mixer other = (Mixer) otherObject;
        return speed == other.speed;
    }

    public int hashCode() {
        return super.hashCode() + 17 * new Integer(speed).hashCode();
    }
}
