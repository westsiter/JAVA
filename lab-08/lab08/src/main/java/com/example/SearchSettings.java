package com.example;

import java.time.LocalDate;

public class SearchSettings {
    private int millageFrom;
    private int millageTo;
    private int yearTo;
    private int yearFrom;
    private LocalDate dateTo;
    private LocalDate dateFrom;
    private String word;
    private double priceFrom;
    private double priceTo;

    public int getMillageTo() {
        return millageTo;
    }

    public int getMillageFrom() {
        return millageFrom;
    }

    public int getYearTo() {
        return yearTo;
    }

    public int getYearFrom() {
        return yearFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public String getWord() {
        return word;
    }

    public double getPriceFrom() {
        return priceFrom;
    }

    public double getPriceTo() {
        return priceTo;
    }

    public void setMillageTo(int millageTo) {
        this.millageTo = millageTo;
    }

    public void setMillageFrom(int millageFrom) {
        this.millageFrom = millageFrom;
    }

    public void setYearTo(int yearTo) {
        this.yearTo = yearTo;
    }

    public void setYearFrom(int yearFrom) {
        this.yearFrom = yearFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public void setPriceFrom(double priceFrom) {
        this.priceFrom = priceFrom;
    }

    public void setPriceTo(double priceTo) {
        this.priceTo = priceTo;
    }

    public void setWord(String word) {
        this.word = word;
    }


}
