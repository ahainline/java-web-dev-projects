package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addMenuItem(MenuItem item) {
        this.items.add(item);
        this.lastUpdated = LocalDate.now();
    }

    public String removeMenuItem(MenuItem item) {
        if (!items.contains(item)) {
            return ("Item is not on the menu.");
        } else {
            items.remove(item);
            this.lastUpdated = LocalDate.now();
            return (item.getName() + " has been removed from the menu.");
        }
    }

    public String toString() {
        String itemList = "";
        for(MenuItem item : items) {
            itemList += item.toString();
        }

        return ("Menu last updated on: " + this.lastUpdated +
                "\n" + itemList);
    }

}


