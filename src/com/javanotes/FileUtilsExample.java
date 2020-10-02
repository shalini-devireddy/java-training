package com.examples;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileUtilsExample{


    File aFile=new File("G:\\onecloud\\orders.csv");

    //   G:\onecloud\orders.csv
    // special characters we have to escape it. \\

	FileUtils aFileUtils = new FileUtils();

	public List<String> readFromFile() throws IOException{

		List<String> linesList;
		
		linesList = aFileUtils.readLines(aFile);
		
		return linesList;
	}
}