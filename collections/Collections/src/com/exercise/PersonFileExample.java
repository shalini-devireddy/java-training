package com.exercise;

import com.objects.Person;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class PersonFileExample {
    List<String> linesFromFile =new ArrayList<String>();
    List<Person> aPersonList=new ArrayList<Person>();
  public List<String> readFromFile(){
      File aFile=new File("C:\\Users\\Haripemireddy\\shalini\\java_project\\src\\address.csv");
      FileUtils aFileUtils=new FileUtils();
      List<String> linesFromFile = null;
      try {
          linesFromFile= aFileUtils.readLines(aFile, StandardCharsets.UTF_8);
      } catch (IOException e) {
          System.out.println("Errorn happend while reading the file");
      }
      return linesFromFile;
  }

//  public void processDta(){
//      for(String aString : linesFromFile)
//      Person aPerson=new Person();
//      aPerson.setName(aString.split(",")[0]);
//      aPerson.setStreet(aString.split(",")[1]);
//      aPerson.setCity(aString.split(",")[2]);
//      aPerson.setState(aString.split(",")[3]);
//      aPersonList.add(aPerson);
 // }

}
