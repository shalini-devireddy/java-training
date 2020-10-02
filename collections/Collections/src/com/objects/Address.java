package com.objects;

public class Address implements Comparable<Address> {
    private String name;
    private String street;
    private String city;
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        String addressString =
                "Name: ".concat(name).concat("::")
                        .concat("Street: ").concat(street).concat("::")
                        .concat("City: ").concat(city).concat("::")
                        .concat("State: ").concat(state);
        return addressString;
    }

    @Override
    public boolean equals(Object obj) {

        boolean isEqual = false;
        System.out.println("inside the equals");
        if (!(obj instanceof Address)) {
            return isEqual;
        } else {
            Address otherAddress = (Address) obj;
//            System.out.println("COMPARING: "+this.name+" TO: "+ otherPerson.getName());
            if (this.name.equals(otherAddress.getName())) {
//                if (this.street.equals(otherPerson.getStreet())) {
//                    if (this.city.equals(otherPerson.getCity())) {
//                       if (this.state.equals(otherPerson.getState())) {
                isEqual = true;
//                       }
//                    }
//                }
            }
            return isEqual;
        }
    }

    @Override
    public int hashCode() {
        int hashcode=37;
        if(name!=null)
            hashcode=hashcode+name.hashCode();
//        if (street!=null)
//            hashcode=hashcode+17*street.hashCode();
//        if (city!=null)
//            hashcode=hashcode+13*city.hashCode();
//        if (state!=null)
//            hashcode=hashcode+11*state.hashCode();

        return hashcode;
    }

    @Override
    public int compareTo(Address otherAddress) {
        int BEFORE = -1;
        int AFTER = 1;
        int EQUAL = 0;

        int returnValue = EQUAL;

        if (this.state.compareToIgnoreCase(otherAddress.getState()) < 0)
            returnValue = BEFORE;
        else if (this.state.compareToIgnoreCase(otherAddress.getState()) > 0)
            returnValue = AFTER;
        else {
            if (this.city.compareToIgnoreCase(otherAddress.getCity()) < 0)
                returnValue = BEFORE;
            else if (this.city.compareToIgnoreCase(otherAddress.getCity()) > 0)
                returnValue = AFTER;
            else
                returnValue = EQUAL;
        }

        return returnValue;
    }

}
