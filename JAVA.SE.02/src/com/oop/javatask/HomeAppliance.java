package com.oop.javatask;

/**
 * Created by IPermyakova on 01.05.2017.
 */
public abstract class HomeAppliance implements Comparable<HomeAppliance>{
    private String colour;
    private String material;
    private int wattage;
    private boolean work = false;

    public HomeAppliance(String colour, String material, int wattage) {
        this.colour = colour;
        this.material = material;
        this.wattage = wattage;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public int getWattage() {
        return wattage;
    }

    public void turnOn () {
        work = true;
    }

    public boolean isWork() {
        return work;
    }

    public String toString() {
        return getClass().getName()
                + ": colour=" + colour
                + ", material=" + material
                + ", wattage=" + wattage + " W";
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        HomeAppliance other = (HomeAppliance) otherObject;
        return colour.equals(other.colour) && material.equals(other.material) && wattage == other.wattage;
    }

    public int hashCode() {
        return 7 * colour.hashCode() + 11 * material.hashCode() + 13 * new Integer(wattage).hashCode();
    }

    public int compareTo(HomeAppliance otherHomeApp) {
        return wattage - otherHomeApp.wattage;
    }


}
