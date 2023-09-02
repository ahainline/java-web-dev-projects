package org.launchcode;

import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double p, String d, String c, boolean iN) {
        this.name = name;
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public String getName() { return this.name; };

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String toString() {
        String isItNew = "";
        if (isNew == true) {
            isItNew = "new to the menu.";
        } else if (isNew == false) {
            isItNew = "not new to the menu.";
        }
        return (name + " is a dish that includes " + description + " and has a price of " + price +
                ".\n It is part of the " + category + " section of the menu and is " + isItNew + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name) && Objects.equals(description, menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}

