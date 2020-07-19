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
                "appetizer",
                false);


        myMenu.addMenuItem(houseSalad);
        printElements(myMenu);

        MenuItem applePie = new MenuItem(
                "Apple Pie",
                5.95,
                "hot homemade apple pie",
                "dessert",
                false);

        myMenu.addMenuItem(applePie);
        printElements(myMenu);

        MenuItem roastedChicken = new MenuItem(
                "Roasted Chicken",
                19.95,
                "Slow cooked roasted chicken with thyme and rosemary",
                "main course",
                false);

        myMenu.addMenuItem(roastedChicken);
        printElements(myMenu);

        MenuItem iceCream = new MenuItem(
                "Ice Cream",
                4.95,
                "vanilla and chocolate ice cream",
                "dessert",
                true);

        myMenu.addMenuItem(iceCream);
        printElements(myMenu);

        MenuItem spaghetti = new MenuItem(
                "Spaghetti",
                19.95,
                "Spaghetti and meatballs",
                "main course",
                true);

        myMenu.addMenuItem(spaghetti);
        printElements(myMenu);

        System.out.println("\nPrint Menu Item");
        System.out.println(spaghetti);

        myMenu.removeMenuItem("Ice Cream");
        System.out.println("\n Removed element");
        printElements(myMenu);
    }

    public static void printElements(Menu aMenu){
        for(MenuItem d: aMenu.getMenus()) {
            System.out.println(d);
        }
    }



}