package com.examples;

public class StarPattern{

	protected int noOfLines;

	public int getNoOfLines(){
        return this.noOfLines;
	}

	public void setNoOflines(int noOfLines){
        this.noOfLines = noOfLines;
	}
  
	public void printStarPattern(){

  		int i =1;
		while(i<=this.noOfLines){
        	int j=1;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println( );
			i++;
		}
  	}
}