package com.examples;

public class StarNumberPattern extends StarPattern{

    public void printNumberPattern(){

  		int i =1;
		while(i<=super.noOfLines){
        	int j=1;
			while(j<=i){
				System.out.print("1");
				j++;
			}
			System.out.println( );
			i++;
		}
  	}
}