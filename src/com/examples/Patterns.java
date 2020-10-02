package com.examples;

public class Patterns extends StarNumberPattern{


   public void printNumberPyramid(){
   	int i =1;
		
		while(i<=super.noOfLines){
           int j=super.noOfLines;
			while(j>=i)
			{
			System.out.print(" ");
			j--;
			}
		
           int k=1;
			while(k<=i)
			{
			System.out.print(" k");
			k++;
			}
		
		System.out.println( );
		i++;
		}

   }


   public void printStarPyramid(){
   	int i =1;
		
		while(i<=super.noOfLines){
           int j=super.noOfLines;
			while(j>=i)
			{
			System.out.print(" ");
			j--;
			}
		
           int k=1;
			while(k<=i)
			{
			System.out.print(" *");
			k++;
			}
		
		System.out.println( );
		i++;
		}

   }

   public void printStarPyramid(int noOfLines){
   	int i =1;
		
		while(i<=noOfLines){
           int j=noOfLines;
			while(j>=i)
			{
			System.out.print(" ");
			j--;
			}
		
           int k=1;
			while(k<=i)
			{
			System.out.print(" *");
			k++;
			}
		
		System.out.println( );
		i++;
		}

   }

}