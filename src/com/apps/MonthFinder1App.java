package com.apps;

import com.examples.MonthFinder1;
import com.examples.MonthFinderByMap;
import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotEvenANumber;

public class MonthFinder1App {

    public static void main(String[] args) {

//        MonthFinder1 aMonthFinder = new MonthFinder1();

        MonthFinderByMap aMonthFinder = new MonthFinderByMap();

        String monthName;

        try{
            monthName = aMonthFinder.findMonth("10");
            System.out.println("The entered month is:"+ monthName);
            }catch(NotAValidMonthNumber aexp) {
            System.out.println("the number you entered is invalid MonthNumber");
            }catch(NotEvenANumber aexp) {
            System.out.println("The Number you entered is not Even a Number");
            }


         try{
              monthName = aMonthFinder.findMonth("18");
               System.out.println("The entered month is:"+ monthName);
                }catch(NotAValidMonthNumber aexp) {
                    System.out.println("the number you entered is invalid MonthNumber");
                }catch(NotEvenANumber aexp) {
                    System.out.println("The Number you entered is not Even a Number");

                }
        try{
            monthName = aMonthFinder.findMonth("Abstraction");
            System.out.println("The entered month is:"+ monthName);
        }catch(NotAValidMonthNumber aexp) {
            System.out.println("the number you entered is invalid MonthNumber");
        }catch(NotEvenANumber aexp) {
            System.out.println("The Number you entered is not Even a Number");

        }




    }
}
