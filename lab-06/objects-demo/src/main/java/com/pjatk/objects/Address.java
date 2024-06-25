package com.pjatk.objects;

import java.util.ArrayList;

public class Address {
    private ArrayList<String> addressLines;
    private int id;
    private String city;
    private String postalCode;
    public Address(int id, String city, String postalCode){
        this.id = id;
        this.city = city;
        this.postalCode = postalCode;
        this.addressLines = new ArrayList<>();
    }
    public ArrayList<String> getAddressLines(){
        return addressLines;
    }
    public int getId(){
        return id;
    }
    public String getCity(){
        return city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setAddressLines(ArrayList<String> addressLines){
        this.addressLines = addressLines;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    public String toString(){
        return "(" + id + ", " + city + ", " + postalCode + ", " + "{" + String.join(", ",addressLines)+ "}" + ")";
    }
}
