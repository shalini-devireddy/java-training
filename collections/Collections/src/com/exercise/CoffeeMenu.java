package com.exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class CoffeeMenu {

    private Map<String, Double> menuMap = new HashMap<String, Double>();
    private Properties menuProperties = new Properties();

    public CoffeeMenu(String pathToFile){

        processMenu(pathToFile);

    }

    public void processMenu(String pathToFile){

        List<String> menuLines = new FileExamples().readDataFromFile(pathToFile);

        for(String aString : menuLines){
//            System.out.println(aString);
//            System.out.println(aString.split("=")[1]);
            String [] priceValues = aString.split("=")[1].split("\\.");

            int dollarValue = Integer.parseInt(priceValues[0]);
            int centValue = Integer.parseInt(priceValues[1]);

            double price = dollarValue + ((double)centValue / 100);

            menuMap.put(aString.split("=")[0], new Double(price));
        }

    }

    public void processMenuWithProps(String fileName){

        System.out.println("The name of the class: "+fileName);

        try {

            menuProperties.load(new FileInputStream(fileName));

            System.out.println("regular coffee price::"+menuProperties.getProperty("regularCoffee"));
            System.out.println("cappucino price::"+menuProperties.getProperty("cappucino"));

            Set<String> propertyNames = menuProperties.stringPropertyNames();

            for(String aString : propertyNames)
                System.out.println("Property name: "+aString);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void showMenu(){

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println(":::::::::M E N U ::::::::::");
        System.out.println(":::::::::::::::::::::::::::");
        for( Map.Entry<String, Double> entry : menuMap.entrySet()){
            System.out.println(":: "+entry.getKey()+" ::$"+entry.getValue());
        }
    }
}