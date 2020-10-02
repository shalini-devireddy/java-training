package com.samples;

public class WrapperExample{

    public void integerCompareDemo(){

      int primitiveInt = 5;

      Integer objectInteger = new Integer(5);

      Integer anotherObjectInteger = new Integer("10");

      Integer thirdObjectInteger = new Integer("something");

      if(objectInteger.compareTo(anotherObjectInteger)==0){
      	sysout --- they are equal
      }


    }




}