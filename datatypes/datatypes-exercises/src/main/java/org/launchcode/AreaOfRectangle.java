package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length: ");
        double length = input.nextDouble();

        System.out.println("Width: ");
        double width = input.nextDouble();
        input.close();

        double area = length*width;

        System.out.println("The area of the rectangle you described is " + area);
    }
}
