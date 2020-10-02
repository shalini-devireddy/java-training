package com.apps;

import java.util.List;
import java.io.IOException;
import com.examples.FileUtilsExample;

public class FileExampleApp{

	public static void main(String[] args) {

		FileUtilsExample fileUtils = new FileUtilsExample();
		try{
			List<String> linesInFile = fileUtils.readFromFile();

			System.out.println("The total number of lines: "+ linesInFile.size());

			// String [] splits = linesInFile.get(1).split(",");

			// for(int i=0;i<splits.length;i++){
			// 	System.out.println(splits[i]);
			// }

			for(String line : linesInFile){

			 String [] splits = line.split(",");

              try{

              	  int itemCost1 = Integer.parseInt(splits[3]);
              	  int itemCost2 = Integer.parseInt(splits[5]);
              	  int ccCharge1 = Integer.parseInt(splits[7]);
              	  int ccCharge2 = Integer.parseInt(splits[9]);

              	  if((itemCost1+itemCost2)==(ccCharge1+ccCharge2)){
              	  	System.out.println("order is valid");
              	  }else{
              	  	System.out.println("order is invalid");
              	  }

              }catch(NumberFormatException exp){
              	System.out.println("exception");
              }

			}




		}catch(IOException exp){
			System.out.println("exception occured");
		}

		/// 3   5    7   9
	}
}