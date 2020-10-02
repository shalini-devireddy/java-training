package com.apps;

public class SecondProgram {

    public static void main(String[] args) {

        FirstProgram aProgram = new FirstProgram();

        int result = aProgram.getIntValue(13);
        System.out.println("the value is: "+result);
    }
}
