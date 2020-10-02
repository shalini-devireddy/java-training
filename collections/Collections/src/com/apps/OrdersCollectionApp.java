package com.apps;

import com.exercise.OrdersCollection;

public class OrdersCollectionApp {
    public static void main(String[] args) {

//        String pathToFile = "C:\\Users\\Haripemireddy\\shalini\\java_project\\src\\orders.csv";

        String pathToFile = "C:\\Users\\Haripemireddy\\orders.csv";

        OrdersCollection aCollection=new OrdersCollection(pathToFile);

        aCollection.processData();
        aCollection.showData();
        aCollection.sortandPrint();
    }
}
