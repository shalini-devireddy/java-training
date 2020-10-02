package com.apps;

import com.exercise.OrdersFile;

import java.util.List;

public class OrdersFileApp {

    public static void main(String[] args) {

        OrdersFile aOrdersFile=new OrdersFile();
        List<String> linesFromFile=aOrdersFile.readFromOrdersFile();
        for(String aString : linesFromFile)
            System.out.println(aString);
    }
}
