package com.exercise;

import com.objects.Person;

import java.util.*;

 public class PersonStringList {

//        private List<String> aStringList=new ArrayList<String>();
        private List<String> aStringList=null;
        private List<Person> aPersonList=new ArrayList<Person>();
        private Set<Person> aPersonSet=new HashSet<Person>();
        private SortedSet<Person> aPersonSortedSet=new TreeSet<Person>();

        public PersonStringList(String pathToFile){
//            aStringList.add("Shalini,237 KaneWind terrece,Alpharetta,GA");
//            aStringList.add("Shalini,125 Davis dr,Cary,NC");
//            aStringList.add("Madhavi,123 Shatilla dr,Cary,NC");
//            aStringList.add("SivaReddy,438 power ferry rd,Cary,NC");
//            aStringList.add("Ravi,347 Shillah dr,Morrisville,NC");
//            aStringList.add("Rajiv,345 Chapel hill rd,Chapel hill,NC");
//            aStringList.add("Suraj,378 Wake dr,Abul,GA");
//            aStringList.add("Reddy,298 dream dr,Suvanee,GA");
//            aStringList.add("james,2121 parlier dr,Morrisville,NC");
//            aStringList.add("Ravi,347 Shillah dr,Morrisville,NC");

            aStringList = new  FileExamples().readDataFromFile(pathToFile);
        }

        public void processData(){
            for (String aString : aStringList) {
                Person aPerson = new Person();
                aPerson.setName(aString.split(",")[0]);
                aPerson.setStreet(aString.split(",")[1]);
                aPerson.setCity(aString.split(",")[2]);
                aPerson.setState(aString.split(",")[3]);
//            System.out.println("");
                aPersonList.add(aPerson);
                aPersonSet.add(aPerson);
                aPersonSortedSet.add(aPerson);
//            System.out.println("The person is "+aPerson);
            }
        }

        public void showData(){
            System.out.println("::::::::::::::::::::::::::");
            System.out.println("::::: LIST DATA:::::::::");
            for (Person aPerson : aPersonList)
                System.out.println(aPerson.toString());
            System.out.println("::::::::::::::::::::::::::");
            System.out.println("::::: SET DATA:::::::::");
            for (Person aPerson : aPersonSet)
                System.out.println(aPerson.toString());
            System.out.println("::::::::::::::::::::::::::");
            System.out.println("::::: SORTED SET DATA:::::::::");
            for (Person aPerson : aPersonSortedSet)
                System.out.println(aPerson.toString());
        }

        public void sortAndPrint(){

            Collections.sort(aPersonList);
            showData();


        }
}


