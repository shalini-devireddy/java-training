package com.apps;

import com.exercise.AddressCollection;

public class AddressCollectionApp {

    public static void main(String[] args) {

        AddressCollection aCollection =  new AddressCollection();

        System.out.println(":::::::: BEFORE :::::");
        aCollection.printAddresses();
//        aCollection.processData("C:\\Users\\Haripemireddy\\persons.csv");
        aCollection.processData("data\\persons.csv");
//        aCollection.processData("data\\personInfo\\persons.csv");
        System.out.println(":::::::: AFTER :::::");
        aCollection.printAddresses();
    }
}
