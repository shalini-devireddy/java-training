package com.domain;

public class Person {

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

    public void printDetails(){
        System.out.println("My Name is: "+name);
        System.out.println("My Street is: "+street);
        System.out.println("My City is: "+city);
        System.out.println("My State is: "+state);
    }

    @Override
    public String toString() {
        String personString = name.concat("::").concat(street).concat("::").concat(city).concat("::").concat(state);
        return personString;
    }

    @Override
    public int hashCode() {

        int hashcode = 37;
        if(name!=null)
            hashcode = hashcode + name.hashCode();
        if(street!=null)
            hashcode = hashcode +  17 * street.hashCode();
        if(city!=null)
            hashcode = hashcode + 13 * city.hashCode();
        if(state !=null)
            hashcode = hashcode + 5 * state.hashCode();

        return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(!(obj instanceof Person))
            return isEqual;
        else{
            Person otherPerson = (Person) obj;
            if(this.name.equals(otherPerson.getName())){
                if(this.street.equals(otherPerson.getStreet())){
                    if(this.city.equals(otherPerson.getCity())){
                        if(this.state.equals(otherPerson.getState())){
                            isEqual =true;
                        }
                    }
                }
            }
        }
        return isEqual;
    }
}
