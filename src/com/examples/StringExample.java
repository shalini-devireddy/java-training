package com.examples;

public class StringExample{

	public void showCompareTo(String stringOne, String stringTwo){

      int i = stringOne.compareTo(stringTwo);
      if(i==0){

        System.out.println("The two strings are equal");    
	   }else if(i<0){
	   	System.out.println("The two strings are not equal and StringOne comes before StringTwo");    
	   }else{
	   	 System.out.println("The two strings are not equal and StringOne comes after StringTwo");    
	   }
    }
}