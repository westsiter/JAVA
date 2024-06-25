package com.pjatk.pesel.model;


import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Person {
    public Person(String peselNumber){
        this.peselNumber = peselNumber;
    }
    private String peselNumber;
    private String name;
    private String surname;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String lastName){
        this.surname = lastName;
    }
    public String getPeselNumber(){
        return peselNumber;
    }
    public String getGender(){
        int num = peselNumber.charAt(9) - 48;
            if(num%2 == 0){
                return "women";
            }
            else {
                return "man";
            }

    }
    public LocalDate getDateOfBirth(){
        int y = Integer.parseInt(19 +peselNumber.substring(0, 2));
        int m = Integer.parseInt(peselNumber.substring(2, 4));
        int d = Integer.parseInt(peselNumber.substring(4, 6));
        LocalDate dt = LocalDate.of(y, m, d);
        return dt;
    }







}
