package com.apps;

import com.examples.ListExample;

public class ListExampleApp {

    public static void main(String[] args) {
        ListExample aListExample = new ListExample();

        // adding three members to the list
        aListExample.addMember("siva");
        aListExample.addMember("shalini");
        aListExample.addMember("madhavi");

        System.out.println("the list members after adding");
        // display the members in the list
        aListExample.showList();
        System.out.println("the size of list is: "+aListExample.sizeOfList());


        // removing from list
        aListExample.removeFromList("siva");
        System.out.println("the list members after removing");
        // diplay
        aListExample.showList();
        System.out.println("the size of list is: "+aListExample.sizeOfList());

        // trying to see if it allows duplicates
        aListExample.addMember("madhavi");

        System.out.println("the list members after adding duplicate");
        aListExample.showList();

        // size of list
        System.out.println("the size of list is: "+aListExample.sizeOfList());

    }
}
