package com.exercise;

package com.exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdersFile {
    // List<String> aStringList=new ArrayList<String>();
    List<String> linesFromFile = new ArrayList<String>();
    List<Orders> aOrderList = new ArrayList<Orders>();

    public List<String> readFromOrdersFile() {
        File aFile = new File("C:\\Users\\Haripemireddy\\shalini\\java_project\\src\\orders.csv");
        FileUtils aFileUtil = new FileUtils();
        // List<String>
        linesFromFile = null;
        try {
            linesFromFile = aFileUtil.readLines(aFile, StandardCharsets.UTF_8);
        } catch (IOException e) {

            System.out.println("Error occured while reading the file");
        }
        return linesFromFile;
    }
    public void processData(){

        for (String aString : linesFromFile) {
            Orders aOrder = new Orders();
            aOrder.setOrderNum(aString.split(",")[0]);
            aOrder.setItem1Name(aString.split(",")[1]);

            aOrderList.add(aOrder);
        }
    }
}
