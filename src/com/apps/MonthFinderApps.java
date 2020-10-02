package com.apps;

import com.examples.MonthFinder;
import com.exceptions.NotAValidMonthNumber;

public class MonthFinderApps{

  public static void main(String[] args) {

  	MonthFinder aMonthFinder = new MonthFinder();

    try{
    	//monthname ==null
	  	String monthName = aMonthFinder.findMonth(1);
	  	// monthname = January
	  	System.out.println(monthName);
	  	// monthname = January
	    monthName = aMonthFinder.findMonth(15);
	    System.out.println(monthName);

	    monthName = aMonthFinder.findMonth("something");
	    System.out.println(monthName);
    }catch(NotAValidMonthNumber aExceptionReference)
    {
      System.out.println("The number given is not a valid month number");
      aMonthFinder = new MonthFinder();
    }
  	
  }

}