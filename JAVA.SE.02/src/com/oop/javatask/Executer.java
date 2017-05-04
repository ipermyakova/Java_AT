package com.oop.javatask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by IPermyakova on 02.05.2017.
 */
public class Executer {
    private TreeSet<HomeAppliance> homeApps;

    public Executer() {
        this.homeApps = loadFromFile();
    }

    public void turnOnApps(List<String> listTypes) {
        for (HomeAppliance homeApp : homeApps) {
            for (String type : listTypes) {
                if (homeApp.getClass().getName().toUpperCase().equals(type.replace("_", ""))) {
                    homeApp.turnOn();
                }
            }
        }

    }

    public TreeSet<HomeAppliance> sortByWattage() {
        TreeSet<HomeAppliance> homeAppsSortedByWattage = new TreeSet<HomeAppliance>(
                new Comparator<HomeAppliance>() {
                    public int compare(HomeAppliance one, HomeAppliance other) {
                        return one.compareTo(other);
                    }

                }
        );
        homeAppsSortedByWattage.addAll(homeApps);
        return homeAppsSortedByWattage;
    }

    public int countWattage() {
        int sumWattage = 0;
        for (HomeAppliance homeApp : homeApps) {
            if (homeApp.isWork()) {
                sumWattage += homeApp.getWattage();
            }
        }

        return sumWattage;
    }

    public HomeAppliance find(int wattage, String colour,  String material) {
        for (HomeAppliance homeApp : homeApps) {
            if (homeApp.getWattage() == wattage && homeApp.getMaterial().equals(material) && homeApp.getColour().equals(colour)) {
                return homeApp;
            }
        }
        return null;
    }

    private TreeSet<HomeAppliance> loadFromFile() {
        TreeSet<HomeAppliance> homeAppsLoad = new TreeSet<>();
        try (BufferedReader input = new BufferedReader(new FileReader("parameters.txt"))){
            String line;
            while ((line = input.readLine()) != null) {
                homeAppsLoad.add(getHomeAppliance(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return homeAppsLoad;
    }

    private HomeAppliance getHomeAppliance(String line) {
        String param[] = line.split("\\|");
        Type type = Enum.valueOf(Type.class, param[0].toUpperCase());
        String colour = param[1];
        String material = param[2];
        int wattage = Integer.parseInt(param[3]);
        switch (type) {
            case WASHER:
                return new Washer(colour, material, wattage, Integer.parseInt(param[4]), Integer.parseInt(param[5]));
            case MIXER:
                return new Mixer(colour, material, wattage, Integer.parseInt(param[4]));
            case COFFER_MASHINES:
                return new CofferMashines(colour, material, wattage, Double.parseDouble(param[4]));
            case KETTLE:
                return new Kettle(colour, material, wattage, Double.parseDouble(param[4]));
            case IRON:
                return new Iron(colour, material, wattage, Integer.parseInt(param[4]));
            case HAIR_DRYER:
                return new HairDryer(colour, material, wattage, Integer.parseInt(param[4]));
            default:
                throw new IllegalArgumentException();
        }
    }
}
