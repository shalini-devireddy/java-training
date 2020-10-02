package com.apps;
import com.exercise.PersonStringList;
public class PersonStringListApp {
    public static void main(String[] args) {

        String pathToDataFile = "data\\persons.csv";
        PersonStringList astrList=new PersonStringList(pathToDataFile);
        //  astrList  --- class
            //  stringList --- strings add constructor
            // personList ---   empty
            // personSet   ---   empty
            // personSortedSet --- empty
        astrList.processData();
        //  astrList  --- class
        //  stringList --- strings add constructor
        // personList ---   persons
        // personSet   ---   persons
        // personSortedSet --- persons
//        astrList.showData();
        astrList.sortAndPrint();


    }
}
