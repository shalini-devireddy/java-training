package com.domain;


/**
 * I'm typing my java doc comments
 */

public class URLFormatObject {

    String url;
    String protocol;
    String ipAddress;
    String domainName;
    String portNumber;
    String path;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void showURLFormatObject(){

        System.out.println("====================");
        System.out.println("=== URL is: "+url);
        System.out.println("=== The parsed values of URL:");
        if(this.getProtocol()!=null)
            System.out.println("The protocol is: "+this.getProtocol());

        if(this.getDomainName()!=null)
            System.out.println("The domain name is: "+this.getDomainName());

        if(this.getPath()!=null)
            System.out.println("The path is: "+this.getPath());

        if(this.getIpAddress()!=null)
            System.out.println("The ipAddress is: "+this.getIpAddress());

        if(this.getPortNumber()!=null)
            System.out.println("The port number is: "+this.getPortNumber());
        System.out.println("====================");
    }
}