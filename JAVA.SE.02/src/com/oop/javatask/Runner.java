package com.oop.javatask;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by IPermyakova on 01.05.2017.
 */
public class Runner {
    private static Executer executor;

    public static void main(String[] arg) {
        executor = new Executer();
        turnOnHomeAppliance();
        countConsumedWattage();
        sortHomeApplianceByWattage();
        findHomeApplianceByParameters();
    }

    public static void turnOnHomeAppliance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter home appliances, that need to be turned on (WASHER, MIXER, COFFER_MASHINES, KETTLE, IRON, HAIR_DRYER)");
        String input = sc.nextLine().toUpperCase();
        executor.turnOnApps(Arrays.asList(input.split(" ")));
    }

    public static void countConsumedWattage() {
        int sumWattage = executor.countWattage();
        System.out.println("Consumed Wattage: " + sumWattage + " W");
    }

    public static void sortHomeApplianceByWattage() {
        TreeSet<HomeAppliance> homeAppsSortedByWattage = executor.sortByWattage();
        for (HomeAppliance homeAppSortedByWattage : homeAppsSortedByWattage) {
            System.out.println(homeAppSortedByWattage);
        }
        System.out.println();
    }

    public static void findHomeApplianceByParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter search parameters (wattage, colour, material)");
        String line = sc.nextLine();
        String[] listParam = line.split(" ");
        if(listParam.length == 3) {
            HomeAppliance homeAppliance = executor.find(Integer.parseInt(listParam[0]), listParam[1], listParam[2]);
            System.out.println((homeAppliance == null) ? " Not found home appliance " : "Found home appliance: [" + homeAppliance + "]");
        } else {
            throw new IllegalArgumentException();
        }
    }
}

