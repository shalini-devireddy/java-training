package com.examples;

import com.domain.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringExampleArray {

        private List<String> aStringList = new ArrayList<String>();

        private List<Person> personList = new ArrayList<Person>();

        private Map<String, Integer> cityMap = new HashMap<String, Integer>();

        private Map<String, Integer> stateMap = new HashMap<String, Integer>();

        private Map<String, List<String>> personCityMap = new HashMap<String, List<String>>();


        public StringExampleArray(){
            aStringList.add("Shalini,237 KaneWind terrece,Alpharetta,NC");
            aStringList.add("Madhavi,123 Shatilla dr,Cary,NC");
            aStringList.add("SivaReddy,438 power ferry rd,Cary,NC");
            aStringList.add("Ravi,347 Shillah dr,Morrisville,NC");
            aStringList.add("Rajiv,345 Chapel hill rd,Chapel hill,NC");
            aStringList.add("Suraj,378 Wake dr,Alpharetta,GA");
            aStringList.add("Reddy,298 dream dr,Suvanee,ga");
            aStringList.add("james,2121 parlier dr,Morrisville,NC");
        }

        public void processData(){

            for(String aString : aStringList ){
                Person aPerson = new Person();
                aPerson.setName(aString.split(",")[0]);
                aPerson.setStreet(aString.split(",")[1]);
                aPerson.setCity(aString.split(",")[2].toUpperCase());
                aPerson.setState(aString.split(",")[3].toUpperCase());
                personList.add(aPerson);
            }
        }

        public void showData(){
            System.out.println(":::: PERSON DETAILS START:::::");
            for (Person aPerson : personList)
                aPerson.printDetails();
            System.out.println(":::: PERSON DETAILS END:::::");
        }

        public void countCities(){
            System.out.println("Initial number of cities: "+cityMap.size());

            for (Person aPerson : personList){
                if(cityMap.get(aPerson.getCity())==null){
//                    System.out.println("First time adding city: "+aPerson.getCity());
                    cityMap.put(aPerson.getCity(),new Integer(1));
                }else{
//                    System.out.println("incrementing count of city: "+aPerson.getCity());
                    Integer count = cityMap.get(aPerson.getCity());
                    count = new Integer(count.intValue()+1);
                    cityMap.put(aPerson.getCity(),count);
                }
            }
            System.out.println("::::  PERSON COUNT IN CITIES START");
            for (Map.Entry<String,Integer> entry : cityMap.entrySet())
                System.out.println("There are: "+entry.getValue()+" in the city: "+entry.getKey());
            System.out.println("::::  PERSON COUNT IN CITIES END");
        }

//    public void countStates(){
//            for (int i=0;i<aString.length;i++){
//                String state=returnState(aString[i]);
//                switch (state)
//                {
//                    case "NC":
//                        nc++;
//                        break;
//                    case "GA":
//                        ga++;
//                        break;
//                }
//            }
//        System.out.println("total in NC : "+nc);
//        System.out.println("total in GA : "+ga);
//    }


}
