package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input");
            return;
        }
        double radius = input.nextDouble();
        input.close();

        System.out.println("The area of a circle of radius " +
                radius + " is: " + Circle.getArea(radius));

    }
}
