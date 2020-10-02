package com.apps;

import com.examples.Calculator;

public class CalculatorApp{

	public static void main(String[] args) {
		
		Calculator mycalc = new Calculator();

		int addresult = mycalc.add(10,24);
		System.out.println("addition result is"+ addresult);

		int subresult = mycalc.sub(56,34);
		System.out.println("subtracted value is"+ subresult);

		int multipliedVal = mycalc.multi(67,29);
		System.out.println("multiplied value is "+ multipliedVal);

		int divisionVal = mycalc.division(56,31);
		System.out.println("divided value is"+ divisionVal); 
	}
}