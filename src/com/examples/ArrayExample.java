package com.samples;

public class ArrayExample{

   String firstString="first string";
   String secondString="second string";
   String thirdString = "third string";
   String fourthString = "fourth string";
   //
   String [] anArrayOfString = new String[10];
   //
   int [] anArrayOfIntegers = new int[25];

   public void showValues(){

		System.out.println("The first string is: "+ firstString);
		System.out.println("The second string is: "+ secondString);
		System.out.println("The third string is: "+ thirdString);
		System.out.println("The fourth string is: "+ fourthString);

         anArrayOfString[0] = "first string";
         anArrayOfString[1] = "second string";
         anArrayOfString[2] = "third string";
         anArrayOfString[3] = "fourth string";
         anArrayOfString[4] = "fifth string";
         anArrayOfString[5] = "sixth string";
         anArrayOfString[6] = "seventh string";
         anArrayOfString[7] = "eigth string";
         anArrayOfString[8] = "nineth string";
         anArrayOfString[9] = "tenth string";
                            
         for(int i=0;i< anArrayOfString.length;i++){
         	System.out.println("The "+(i+1)+"th string is: "+ anArrayOfString[i]);
         }

         for(int i=0;i<anArrayOfIntegers.length;i++){
         	anArrayOfIntegers[i] = i*10;
         }

         for(int i=0;i<anArrayOfIntegers.length;i++){
         	System.out.println("The "+(i+1)+"th integer is: "+ anArrayOfIntegers[i]);
         }
   }
}