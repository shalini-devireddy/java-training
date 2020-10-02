package com.samples;

import com.domain.URLFormatObject;
import com.exceptions.NotAValidFormat;

/**
 * THis is my third comment
 */

public class URLParser {

    public URLFormatObject parseURL(String url) throws NotAValidFormat {

        // protocol domainname path
        // http://www.onecloud.com/autotools

        // protocol ipaddress portnumber path
        // http://24.106.206.2:10080/autotools

//        System.out.println("The url string is: "+url);
        String [] urlSplits = url.split("/");
//        System.out.println("The url splits length is: "+urlSplits.length);

//        for (int i = 0; i < urlSplits.length; i++) {
//            System.out.println("The split "+i+" value is: "+urlSplits[i]);
//        }

//        System.out.println("The split value is: "+urlSplits[2]);

        String [] thirdPartSplits = urlSplits[2].split("\\.");

//        System.out.println("Total splits in third part: "+thirdPartSplits.length);

        if(urlSplits.length==4){
            if(thirdPartSplits.length!=3 && thirdPartSplits.length!=4 ){
                throw new NotAValidFormat();
            }

        }else{
            throw new NotAValidFormat();
        }

        URLFormatObject returnObject = new URLFormatObject();

        returnObject.setProtocol( urlSplits[0].split(":")[0] );
        returnObject.setPath(urlSplits[3]);

        if(thirdPartSplits.length==3){

            returnObject.setDomainName(urlSplits[2]);

        }else if(thirdPartSplits.length==4){

            String [] ipSplits = urlSplits[2].split(":");
            returnObject.setIpAddress(ipSplits[0]);
            returnObject.setPortNumber(urlSplits[2].split(":")[1]);
        }

        returnObject.setUrl(url);
        return returnObject;
    }
}