package com.apps;

import com.exercise.CoffeeMenu;

public class CoffeeMenuApp {

    public static void main(String[] args) {

        CoffeeMenu aMenu = new CoffeeMenu("data\\coffeemenu.cfg");
//        aMenu.showMenu();
        aMenu.processMenuWithProps("data\\coffeemenu.cfg");
    }
}
