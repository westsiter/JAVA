package org.example;

public class Money {
    private double value;
    private Currency currency;
    public Money(double value, Currency currency){
        this.value = value;
        this.currency = currency;
    }
    public double getValue(){
        return value;
    }
    public Currency getCurrency(){
        return currency;
    }
}
