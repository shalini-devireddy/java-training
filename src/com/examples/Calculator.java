package com.examples;

public class Calculator{


	public int add(int firstNumber,int secondNumber)
	{

		int result = firstNumber + secondNumber;
			return result;
	}

	public int division(int firstNumber, int secondNumber)
	{

		int dividedNumber = 0;
		if(secondNumber == 0)
		   {
			  System.out.println("division with zero is not possible");
		    }
		else
		{
			  dividedNumber = firstNumber / secondNumber;
		}
           return dividedNumber;
	}
	public int multi(int firstNumber, int secondNumber)
	{
		
		int multiplication = firstNumber * secondNumber;	
	    	return multiplication; 
	}
	public int sub(int firstNumber, int secondNumber)
	{

		int subResult = firstNumber - secondNumber;
		  return subResult;
	}  
}
