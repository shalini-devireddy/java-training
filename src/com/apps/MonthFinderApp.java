package com.apps;

import com.examples.MonthFinder;

public class MonthFinderApp{

  public static void main(String[] args) {

  	MonthFinder aMonthFinder = new MonthFinder();

    try{
	  	String monthName = aMonthFinder.findMonth(1);

	  	System.out.println(monthName);

	    monthName = aMonthFinder.findMonth(15);

	    System.out.println(monthName);
	}catch(InvalidNumberException){
       System.out.println("You entered a invalid number");
	}
  	
  }

}