package com.examples;

import com.exceptions.NotAValidMonthNumber;

public class MonthFinderExample{

  public String findMonth(String monthNumber) throws NotAValidMonthNumber, NotEvenAnumber{

  	String monthName=null;
    int intMonthNumber = 0;

    try{
         intMonthNumber = Integer.parseInt(monthNumber);
         // "1"   "123"  "something"
    }catch(NumberFormatException exp){
       throw new NotEvenAnumber();
    }

  	if(intMonthNumber<1 || intMonthNumber >12){
  		  throw new NotAValidMonthNumber(); 
  	}

      switch(intMonthNumber){
      	case 1:
          monthName = "January";
          break;
        case 2:
          monthName = "February";
          break;
          /// todo -- need to write code for remaining months
      }

    return monthName;  
  }

}