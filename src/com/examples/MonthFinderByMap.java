package com.examples;

import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotEvenANumber;


import java.util.HashMap;
import java.util.Map;

public class MonthFinderByMap {

    private Map<Integer,String> monthMap = new HashMap<Integer, String>();

    public MonthFinderByMap(){

        monthMap.put(new Integer("1"), new String("January") );
        monthMap.put(new Integer("2"), new String("February") );
        monthMap.put(new Integer("3"), new String("March") );
        monthMap.put(new Integer("10"), new String("October") );

    }
    public String findMonth(String stringMonthNumber) throws NotEvenANumber, NotAValidMonthNumber{

        

        String monthName = null;
        int monthNumber =0;

        try{
            monthNumber = Integer.parseInt(stringMonthNumber);
        }catch (NumberFormatException aexp){
            throw new NotEvenANumber();
        }
        if(monthNumber<1 || monthNumber>12){
            throw new NotAValidMonthNumber();
        }

        monthName = monthMap.get(new Integer(monthNumber));
        return monthName;
    }

}
