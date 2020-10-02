package com.apps;

public class FirstProgram {

    private int intNum=9;
    private boolean boolValue;

    public int getIntValue(int someOtherInt){
        return intNum + someOtherInt;
    }

    public void printValue(int someOtherInt){
        int otherValue = 13;
        int result = getIntValue(otherValue);
        System.out.println(result);
    }
}
