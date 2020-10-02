package com.samples;

public class WrapperExample{

    public void integerCompareDemo(){

      // declaring the variable and initializing it
      int primitiveInt = 5;

      // declaring the variable and initializing it
      Integer objectInteger = new Integer(5);
      // declare the variable
      Integer anotherObjectInteger=null;

      Integer fourthObjectInt = new Integer(5);

      try{
      	  anotherObjectInteger = new Integer("10");
      }catch(NumberFormatException aExp){
      	System.out.println("Exception thrown when converting string 10 to integer");
      }

      try{
      	Integer thirdObjectInteger = new Integer("something");
      }catch(NumberFormatException aExp){
      	System.out.println("Exception thrown when converting string something to integer");
      }

      if(objectInteger.compareTo(anotherObjectInteger)==0){
      	 System.out.println("The integers obejctInteger and anotherObjectInteger are equal");
      }else{
      	System.out.println("The integers obejctInteger and anotherObjectInteger are not equal");
      	System.out.println("The integers"+ objectInteger.intValue() +" and "+anotherObjectInteger.intValue() +" are not equal");
      }

      if(objectInteger.compareTo(fourthObjectInt)==0){
      	 System.out.println("The integers obejctInteger and fourthObjectInteger are equal");
      }else{
      	System.out.println("The integers obejctInteger and anotherObjectInteger are not equal");
      }

    }
}