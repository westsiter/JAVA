package com.example;

import java.time.LocalDate;

public abstract class PersonBase {
    protected String name;
    protected String surname;
    protected LocalDate dateOfBirth;
    protected Gender gender;
    protected PersonBase(String name, String surname, LocalDate dateOfBirth, Gender gender){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public Gender getGender(){
        return gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void  setGender(Gender gender){
        this.gender = gender;
    }
    public  void printPersonDetails(){
        System.out.println(name + " " + surname + " " + dateOfBirth + " " + gender + " " + getDetails());
    }
    public abstract String getDetails();
}
