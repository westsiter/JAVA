package com.example;

import java.time.LocalDate;

public class CarOffer {

    private int millage;
    private int year;
    private LocalDate date;
    private String title;
    private double price;

    public CarOffer(int millage, int year, LocalDate date, String title, double price) {
        this.millage = millage;
        this.year = year;
        this.date = date;
        this.title = title;
        this.price = price;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
