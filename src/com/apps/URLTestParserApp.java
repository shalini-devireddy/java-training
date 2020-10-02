package com.apps;

import com.examples.URLObject;
import com.examples.URLParser;
import com.exceptions.NotAValidInputException;

public class URLParserApp {

	public static void main(String[] args) {

		// Test case 1:
		URLObject urlObject =
				URLParserApp.testApp(new URLParser(), "http://www.kubecloudsinc.com/autotools" );
		if(urlObject.getDnsName().equals("www.kubeclooudsinc.com"))
			System.out.println("Passed");
		else
			System.out.println("Failed");


		// Test case 2:
		urlObject =
				URLParserApp.testApp(new URLParser(), "http://24.106.206.2:10080/autotools" );
		if(urlObject.getIpAddress().equals("24.106.206.2"))
			System.out.println("Passed");
		else
			System.out.println("Failed");

		// Test case 3

		urlObject =
				URLParserApp.testApp(new URLParser(), "http//2/autotools" );
		if(urlObject==null)
			System.out.println("Passed");
		else
			System.out.println("Failed");

		// Test case 4

		urlObject =
				URLParserApp.testApp(new URLParser(), "a/b/c/d" );
		if(urlObject==null)
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	private static URLObject testApp(URLParser aURLParser, String url){

		URLObject urlObject = null;
		try {
			urlObject = aURLParser.parseURL(url);
			System.out.println(urlObject.toString());
		} catch (NotAValidInputException e) {
			System.out.println("Please enter a valid URL String");
		}
		return urlObject;
	}
}
