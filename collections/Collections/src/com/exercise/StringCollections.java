package com.exercise;

import com.objects.Person;

import java.util.*;

 public class StringCollections {

     private List<String> aStringList = new ArrayList<String>();
     private List<Person> personList = new ArrayList<Person>();
     private Map<String, Integer> cityMap = new HashMap<String, Integer>();
     private Map<String, Integer> stateMap = new HashMap<String, Integer>();
     private Map<String, Set<String>> personCityMap = new HashMap<String, Set<String>>();

     public StringCollections() {
         aStringList.add("Shalini,237 KaneWind terrece,Alpharetta,NC");
         aStringList.add("Madhavi,123 Shatilla dr,Cary,NC");
         aStringList.add("SivaReddy,438 power ferry rd,Cary,NC");
         aStringList.add("Ravi,347 Shillah dr,Morrisville,NC");
         aStringList.add("Rajiv,345 Chapel hill rd,Chapel hill,NC");
         aStringList.add("Suraj,378 Wake dr,Alpharetta,GA");
         aStringList.add("Reddy,298 dream dr,Suvanee,ga");
         aStringList.add("james,2121 parlier dr,Morrisville,NC");
     }

     public void processData() {
         for (String aString : aStringList) {
             Person aPerson = new Person();
             aPerson.setName(aString.split(",")[0]);
             aPerson.setStreet(aString.split(",")[1]);
             aPerson.setCity(aString.split(",")[2].toUpperCase());
             aPerson.setState(aString.split(",")[3].toUpperCase());
             personList.add(aPerson);
             System.out.println(" The person is: " + aPerson);
         }
     }

     public void showData() {

         System.out.println("*****person details START*****");
         for (Person aPerson : personList)
             aPerson.toString();
         System.out.println("******person details end******");
     }

     public void countCities() {
         System.out.println(("Initial number of cities :" + cityMap.size()));

         for (Person aPerson : personList) {
             if (cityMap.get(aPerson.getCity()) == null) {
                 cityMap.put(aPerson.getCity(), new Integer(1));
             } else {
                 Integer count = cityMap.get(aPerson.getCity());
                 count = new Integer(count.intValue() + 1);
                 cityMap.put(aPerson.getCity(), count);
             }
         }
         System.out.println(" persons count start from city");
         for (Map.Entry<String, Integer> entry : cityMap.entrySet())
             System.out.println(("There are " + entry.getValue() + " persons in the city :" + entry.getKey()));

     }

     public void countStates() {
         System.out.println("initial number of states :" + stateMap.size());
         for (Person aPerson : personList) {
             if (stateMap.get(aPerson.getState()) == null) {
                 stateMap.put(aPerson.getState(), new Integer(1));

             } else {
                 Integer count = stateMap.get(aPerson.getState());
                 count = new Integer(count.intValue() + 1);
                 stateMap.put(aPerson.getState(), count);
             }
         }
         System.out.println("persons count starts from each State");
         for (Map.Entry<String, Integer> entry : stateMap.entrySet())
             System.out.println("there are " + entry.getValue() + "  persons in the states :" + entry.getKey());
     }

     public void countPersonCities() {
         System.out.println(("Initial number of cities :" + personCityMap.size()));

         for (Person aPerson : personList) {
             if (personCityMap.get(aPerson.getCity()) == null) {
                 Set<String> personSet = new HashSet<String>();
                 personSet.add(aPerson.getName());
                 personCityMap.put(aPerson.getCity(), personSet);
             } else {
                 Set<String> personSet = personCityMap.get(aPerson.getCity());
                 personSet.add(aPerson.getName());
                 personCityMap.put(aPerson.getCity(), personSet);
             }
         }
         System.out.println(" persons names start from city");
         for (Map.Entry<String, Set<String>> entry : personCityMap.entrySet()) {
//            System.out.println(("There are " + entry.getValue() + " persons in the city :" + entry.getKey()));
             System.out.println("The persons living in City: " + entry.getKey());
             Set<String> personSet = entry.getValue();
             for (String personName : personSet) {
                 System.out.println("     The name of person is: " + personName);
             }
         }

     }
 }

