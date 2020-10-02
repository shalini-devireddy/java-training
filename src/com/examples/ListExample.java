package com.examples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    List<String>  aList = new ArrayList<String>();

    public void showList(){
        for (String tempString : aList){
            System.out.println("The value is: "+tempString);
        }
    }

    public void addMember(String tempString){

        boolean result = aList.add(tempString);
        System.out.println("Did the member get added? "+result);
    }

    public int sizeOfList(){
        return aList.size();
    }

    public void removeFromList(String toBeRemoved){
        aList.remove(toBeRemoved);
    }
}
