package com.apps;

import com.examples.Patterns;
import com.examples.StarNumberPattern;
import com.examples.StarPattern;


public class PatternsApp{

	public static void main(String[] args) {
		
		Patterns aPattern = new Patterns();

		aPattern.setNoOflines(5);

		// aPattern.noOfLines = 5;

		aPattern.printStarPattern();
		aPattern.printNumberPattern();
		aPattern.printNumberPyramid();
		aPattern.printStarPyramid();
		aPattern.printStarPyramid(10);


		Animal anAnimal = new Animal();

		anAnima.setNoOfLegs(2);
	}
}