package com.pjatk.objects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person{

    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private ArrayList<Address> addresses;
    public Person(int id, String name, LocalDate dateOfBirth){
        this.id = id;
        this.name= name;
        this.dateOfBirth = dateOfBirth;
        this.addresses = new ArrayList<>();
    }
    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public ArrayList<Address> getAddresses(){
        return addresses;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Person copy() {
        return new Person(this.id, this.name, this.dateOfBirth);
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Person)){
            return false;
        }
        Person person = (Person) o;
        if(person.id == this.id && person.dateOfBirth.equals(this.dateOfBirth) && Objects.equals(person.name, this.name)&& person.getAddresses().size() == this.getAddresses().size() && person.getAddresses().containsAll(this.getAddresses())){
            return true;
        }
        return false;
    }

    public String toString(){
        String result = "("+ id + ", " + name + ", " + dateOfBirth + ")" + "\n" + "Adresy:" + "\n" ;
        for (Address address: addresses) {
            result += address + "\n";
        }
        return result;

    }

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime *  result
                + id + name.hashCode() + dateOfBirth.hashCode();
        return result;
    }


}

