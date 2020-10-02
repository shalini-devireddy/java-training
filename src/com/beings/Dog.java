package com.beings;

import com.examples.Pet;

public class Dog extends Animal implements Pet{

  ///  this is the default contructor that one tat was there from
	/// Object classs when we did not define it
	/// but after overloading with boolean we have to give this
	// other wise we will get compilation error
  public Dog(){
  	super();
  }

//// this is the overloaded constructor that take boolean to change
  /// the tail variable in this class
  public Dog(boolean youWantTail){
  	  super();
  	  this.hasTail = youWantTail;
  	  /// i need to create dog here

  }

  public void says(){
  	System.out.println("woof!woof");
  }

  public void petable(){
   System.out.println("I'm a dog pet");	
  }
}