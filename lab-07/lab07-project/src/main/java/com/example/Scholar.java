package com.example;

import java.time.LocalDate;

public class Scholar extends PersonBase{
    private double scholarship;

    private String index;

    public Scholar(String name, String surname, LocalDate dateOfBirth, Gender gender) {
        super(name, surname, dateOfBirth, gender);
    }

    public String getIndex(){
        return index;
    }
    public double getScholarship(){
        return scholarship;
    }

    public void setIndex(String index){
        this.index = index;
    }
    public void setScholarship(double scholarship){
        this.scholarship = scholarship;
    }
    public String getDetails() {
        return Double.toString(scholarship) + " " + index;
    }

}
