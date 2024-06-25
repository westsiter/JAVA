package com.example;

import java.time.LocalDate;

public class Student extends PersonBase {

    private String index;

    public Student(String name, String surname, LocalDate dateOfBirth, Gender gender) {
        super(name, surname, dateOfBirth, gender);
    }


    public String getIndex(){
        return index;
    }
    public void setIndex(String index){
        this.index = index;
    }
    public String getDetails(){
        return index;
    }
}
