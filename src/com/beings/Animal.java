package com.beings;


abstract public class Animal{

	int noOfLegs=4;
	boolean hasTail=true;


   public int getNoOfLegs(){
   	  return this.noOfLegs;
   }
                                   
   public void setNoOfLegs(int noOfLegs){

   	   this.noOfLegs = noOfLegs;
   }

   public boolean getHasTail(){
   	  return this.hasTail;
   }

   public void setHasTail(boolean hasTail){
   	   this.hasTail = hasTail;
   }

   public abstract void says();
}