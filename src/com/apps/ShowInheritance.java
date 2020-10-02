package com.apps;

import com.beings.Dog;

public class ShowInheritance {

    public static void main(String[] args) {

        // created the first string
        String aString = "firstString";

        String bString = "secondString";
        String cString = "thirdString";

        Integer aInteger = new Integer("1");

        Dog aDog = new Dog();

        // poly morphism
        // animal class
        // dog, cat

        // Animal anAnimal = new Dog();

        Object [] anObjectArray = new Object[5];

        // i poly morphed into a object
        anObjectArray[0] = aString;


        anObjectArray[1] = bString;
        anObjectArray[2] = cString;
        anObjectArray[3] = aInteger;
        anObjectArray[4] = aDog;
     //   casting the object
        /// convert oe obejct type to another type when you are sure
        // I converted back to String
        String castedString = (String) anObjectArray[0];

        System.out.println(" the value of castedString: "+castedString);

        castedString = (String) anObjectArray[1];

        System.out.println(" the value of castedString: "+castedString);

        castedString = (String) anObjectArray[2];

        System.out.println(" the value of castedString: "+castedString);

        castedString = (String) anObjectArray[3];

        System.out.println(" the value of castedString: "+castedString);

        castedString = (String) anObjectArray[0];

        for (int i = 0; i < anObjectArray.length ; i++) {
            System.out.println("the value of object is: "+ anObjectArray);
        }

    }
}
