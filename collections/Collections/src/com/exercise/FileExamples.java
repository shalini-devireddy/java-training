package com.exercise;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.objects.Person;
import org.apache.commons.io.FileUtils;


public class FileExamples {

    public List<String> readDataFromFile(){

        File aFile = new File("C:\\Users\\Haripemireddy\\orders.csv");
        FileUtils aFileUtils = new FileUtils();

        List<String> linesFromFile = null;

        try {
            linesFromFile = aFileUtils.readLines(aFile, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Some error happened while reading the file");
        }
        return linesFromFile;
    }

    public List<String> readDataFromFile(String path){

        File aFile = new File(path);
        FileUtils aFileUtils = new FileUtils();

        List<String> linesFromFile = null;

        try {
            linesFromFile = aFileUtils.readLines(aFile, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("path is: "+path);
            System.out.println("Some error happened while reading the file");
        }
        return linesFromFile;
    }

}
