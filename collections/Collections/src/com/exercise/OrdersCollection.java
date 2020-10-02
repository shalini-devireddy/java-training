package com.exercise;

import com.objects.Orders;

import java.util.*;

public class OrdersCollection {
    List<String> aStringList=new ArrayList<String>();
    List<Orders> aOrdersList=new ArrayList<Orders>();
    Set<Orders> aOrdersSet=new HashSet<Orders>();
    SortedSet<Orders> aOrdersSortedSet=new TreeSet<Orders>();

    public OrdersCollection(String pathToFile){
//        aStringList.add("1,OIL,10,RICE,5,SOAP,8");
//        aStringList.add("2,BRUSH,10,PASTE,5,RICE,5");
//        aStringList.add("3,SNACK,12,NUTS,15,PASTA,6");
//        aStringList.add("4,BREAD,5,COOKIES,7,BANANA,2");
//        aStringList.add("5,BEANS,4,TOMATOES,9,APPLE,13");
//        aStringList.add("6,ICECREAM,12,CHEESE,15,EGGS,6");
//        aStringList.add("7,PASTE,5,PASTA,6,NUTS,15");
//        aStringList.add("8,APPLE,13,MANGO,7,SPINACH,4");
//        aStringList.add("9,BOWLS,20,SHAMPOO,12,FLOWER,9");
//        aStringList.add("10,APPLES,13,BREAD,4,NUTELLA,18");
        FileExamples fileProcessor = new FileExamples();
        aStringList = fileProcessor.readDataFromFile(pathToFile);
    }
    public void processData(){
        for (String aString : aStringList) {
            System.out.println("About to process: "+aString);
            Orders aOrder=new Orders();
            aOrder.setOrderNum(aString.split(",")[0]);
            aOrder.setItem1Name(aString.split(",")[1]);
            try{
                aOrder.setItem1Cost(Integer.parseInt(aString.split(",")[2]));
            }catch(NumberFormatException exp){
                System.out.println("Wrong data encountered");
            }
//            aOrder.setItem1Cost(aString.split(",")[2]);
            aOrder.setItem2Name(aString.split(",")[3]);
            aOrder.setItem2Cost(aString.split(",")[4]);
            aOrder.setItem3Name(aString.split(",")[5]);
            aOrder.setItem3Cost(aString.split(",")[6]);
            aOrdersList.add(aOrder);
            aOrdersSet.add(aOrder);
            aOrdersSortedSet.add(aOrder);
        }
    }
    public void showData(){
        System.out.println("::::::::::::::::::::::::::");
        System.out.println("::::: LIST DATA:::::::::");
        for(Orders aOrder : aOrdersList)
            System.out.println(aOrder.toString());
        System.out.println("::::::::::::::::::::::::::");
        System.out.println("::::: SET DATA:::::::::");
        for (Orders aOrder : aOrdersSet)
            System.out.println(aOrder.toString());
        System.out.println("::::::::::::::::::::::::::");
        System.out.println("::::: LIST DATA:::::::::");
        for(Orders aOrder : aOrdersSortedSet)
            System.out.println(aOrder.toString());
    }
    public void sortandPrint(){
        Collections.sort(aOrdersList);
        showData();
    }
}

