package com.pjatk.bank;

public class BankAccount {
    private String accountNumber;
    private double money;
    private String name;



    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void add(double amount){
        money += amount;
    }
    public void subtract(double amount){
        money -= amount;
    }
    public double getMoney(){
        return money;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getName(){
        return name;
    }




}

