package com.oop.javatask;

/**
 * Created by IPermyakova on 01.05.2017.
 */
public class Iron extends HomeAppliance{
    private int steamShot;
    public Iron(String colour, String material, int wattage, int steamShot) {
        super(colour, material, wattage);
        this.steamShot = steamShot;
    }
    public String toString() {
        return super.toString()
                + ", steam shot=" + steamShot + " g";
    }
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Iron other = (Iron) otherObject;
        return steamShot == other.steamShot;
    }
    public int hashCode() {
        return super.hashCode() + 17 * new Integer(steamShot).hashCode();
    }
}
