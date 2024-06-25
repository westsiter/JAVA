package com.example;

import java.time.LocalDate;

public class Lecturer extends PersonBase{
    private String title;
    public String getDetails(){
        return title;
    }

    public Lecturer(String name, String surname, LocalDate dateOfBirth, Gender gender) {
        super(name, surname, dateOfBirth, gender);

    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
