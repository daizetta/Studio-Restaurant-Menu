package com.company;

import restaurant.Menu;
import restaurant.MenuItem;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Menu myMenu = new Menu();
        printElements(myMenu);

        MenuItem houseSalad = new MenuItem(
                "Avocado House Salad",
                15.95,
                "fresh avocado salad",
                "appetizer");

        myMenu.addMenuItem(houseSalad);
        printElements(myMenu);

        MenuItem applePie = new MenuItem(
                "Apple Pie",
                5.95,
                "hot homemade apple pie",
                "dessert");

        myMenu.addMenuItem(applePie);
        printElements(myMenu);

        MenuItem roastedChicken = new MenuItem(
                "Roasted Chicken",
                19.95,
                "Slow cooked roasted chicken with thyme and rosemary",
                "main course");

        myMenu.addMenuItem(roastedChicken);
        printElements(myMenu);
    }

    public static void printElements(Menu aMenu){
        for(MenuItem d: aMenu.getMenus()) {
            System.out.println(d);
        }
    }
}