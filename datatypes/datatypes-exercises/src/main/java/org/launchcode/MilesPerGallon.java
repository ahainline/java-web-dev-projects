package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles driven?");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gas did you use?");
        double gas = input.nextDouble();

        input.close();

        double mileage = miles/gas;
        System.out.println("You got " + mileage + " miles per gallon on this trip");
    }
}
