package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
	// write your code here
        MenuItem menuItem = new MenuItem(11.99, "Chicken sandwich", "Main", false);
   ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
   menuItemList.add(menuItem);
   Date lastUpdate = new Date(11/11/2023);
        Menu menu = new Menu(menuItemList, lastUpdate);
        System.out.println(menu.toString());
        MenuItem menuItem2 = new MenuItem(11.99, "Soup", "Main", true);
        menu.addItem(menuItem2);
        System.out.println(menu.toString());

//        menu.removeItem(menuItem);
        System.out.println(menu.toString());

        System.out.println(menu.isNewItem(menuItem));
    }
}
