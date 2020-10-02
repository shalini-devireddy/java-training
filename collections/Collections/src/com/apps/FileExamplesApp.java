package com.apps;

import com.exercise.FileExamples;

import java.util.List;

public class FileExamplesApp {

    public static void main(String[] args) {

        FileExamples aFileExample = new FileExamples();

        List<String> linesFromFile = aFileExample.readDataFromFile();


        for(String aString : linesFromFile){
            System.out.println(aString);
        }

    }
}
