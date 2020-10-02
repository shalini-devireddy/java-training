package com.examples;

public class ArraySearch{
	int[] anIntArray = new int[10];

	public void searchForMaxNumber(){
		int max=anIntArray[0];

		anIntArray[0]= 5;
		anIntArray[1]= 23;
		anIntArray[2]= 58;
		anIntArray[3]= 15;
		anIntArray[4]= 79;
		anIntArray[5]= 112;
		anIntArray[6]= 57;
		anIntArray[7]= 6;
		anIntArray[8]= 89;
		anIntArray[9]= 151;
		for (int i=1;i<anIntArray.length ;i++ ) {
			if (anIntArray[i]>max) {
				
				max= anIntArray[i];
			}
			
		}
        System.out.println("the biggest number is"=max);
		
	}
}