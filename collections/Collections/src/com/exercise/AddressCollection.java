package com.exercise;

import com.objects.Address;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressCollection {

    List<Address> addressList = new ArrayList<Address>();

    public void printAddresses(){
        for(Address aAddress : this.addressList)
            System.out.println(aAddress.toString());
    }

    public int countAddresses(){
        return this.addressList.size();
    }

    public void processData(String pathToFile){

        FileExamples fileUtils = new FileExamples();
        List<String> linesFromFile = fileUtils.readDataFromFile(pathToFile);

        for(String aString : linesFromFile ){
            System.out.println(aString);
            Address aAddress = new Address();
            aAddress.setName(aString.split(",")[0]);
            aAddress.setStreet(aString.split(",")[1]);
            aAddress.setCity(aString.split(",")[2]);
            aAddress.setState(aString.split(",")[3]);

            this.addressList.add(aAddress);
        }
    }

    public void printAddressByStateCity(){

        Collections.sort(addressList);

    }
}
