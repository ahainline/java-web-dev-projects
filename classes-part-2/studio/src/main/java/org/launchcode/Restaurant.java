package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        // write your code here
        Menu menu = new Menu(LocalDate.now(), new ArrayList<>());
        MenuItem burger = new MenuItem("House burger", 12.99, "Single beef patty with LOTP, served with fries", "Mains", false);
        MenuItem cBurger = new MenuItem("Cheeseburger", 13.49, "Single beef patty with LOTP and your choice of cheese", "Mains", false);
        MenuItem fries = new MenuItem("Fries", 3.99, "Basket of thick cut fries served with your choice of dipping sauce", "Sides", false);
        MenuItem broccoli  = new MenuItem("Steamed broccoli", 4.49, "Steamed and seasoned fresh broccoli", "Sides", false);
        MenuItem cookie = new MenuItem("Chocolate Chip Cookie", 1.50, "Chocolate chip cookie baked daily", "Desserts", false);

        menu.addMenuItem(burger);
        menu.addMenuItem(cBurger);
        menu.addMenuItem(fries);
        menu.addMenuItem(broccoli);
        menu.addMenuItem(cookie);
        System.out.println("Entire Menu: \n" + menu);
        System.out.println("Single Item: \n" + menu.getItems().get(0));

        addNewMenuItem(menu);
        System.out.println(menu);

        menu.removeMenuItem(fries);
        System.out.println(menu);

    }

//    (String name, double p, String d, String c, boolean iN)
    public static void addNewMenuItem(Menu menu) {
        System.out.println("I need some information to add a new item to the menu.");

        Scanner input = new Scanner(System.in);

        String name = getStringField("Item name: ", input);
        String description = getStringField("Item description: ", input);
        String category = getStringField("Item category: ", input);
        boolean isNew = getYesOrNo("Is this a new item? (y or n)", input);
        double price = getDoubleField("Item price: ", input);
        input.close();

        MenuItem itemToAdd = new MenuItem(name, price, description, category, isNew);
        menu.addMenuItem(itemToAdd);
    }

    private static String getStringField(String userText, Scanner input) {
        System.out.println(userText);
        String string = input.nextLine();
        return string;
    }

    private static double getDoubleField(String userText, Scanner input) {
        System.out.println(userText);
        double num = input.nextDouble();
        return num;
    }

    private static boolean getYesOrNo(String userText, Scanner input) {
        System.out.println(userText);
        String yOrN = "";
        do {
            yOrN = input.nextLine();

        } while (!yOrN.equalsIgnoreCase("y") && !yOrN.equalsIgnoreCase("n"));

        return yOrN.equalsIgnoreCase("y");
    }
}
