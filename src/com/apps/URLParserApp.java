package com.apps;

import com.domain.URLFormatObject;
import com.exceptions.NotAValidFormat;
import com.samples.URLParser;

public class URLParserApp {

    public static void main(String[] args) {

        System.out.println("THis si URLParserApp");

        URLParser aParser = new URLParser();

        //  --- test cases ---
        //  domain name  t1
        // ipadress     t2
        // invalid format
           //    no 4 splits  t3
          //    has 4 splits but third split doesnt have 3 split or 4 splits    t4
        // UNIT TESTING

        URLFormatObject aParsedObject;

        try {
            aParsedObject = aParser.parseURL("http://www.onecloud.com/autotools");

            aParsedObject.showURLFormatObject();

        } catch (NotAValidFormat exp){
            System.out.println("The URL format you send is invalid.");
        }

        try {
            aParsedObject = aParser.parseURL("http://24.106.206.2:10080/autotools");

            aParsedObject.showURLFormatObject();
        } catch (NotAValidFormat exp){
            System.out.println("The URL format you send is invalid.");
        }

        try{
            aParsedObject = aParser.parseURL("http://abc/autotools");

            aParsedObject.showURLFormatObject();
        } catch (NotAValidFormat exp){
            System.out.println("The URL format you send is invalid.");
        }
//
        try{
            aParsedObject = aParser.parseURL("http://autotools");

            aParsedObject.showURLFormatObject();
        } catch (NotAValidFormat exp){
            System.out.println("The URL format you send is invalid.");
        }

    }
}