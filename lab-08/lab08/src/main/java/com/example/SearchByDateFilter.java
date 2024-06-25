package com.example;

import java.util.ArrayList;
import java.util.List;

public class SearchByDateFilter implements Filter {
    private SearchSettings searchSettings;
    private List<CarOffer> carOffers;
    public void setSearchSettings(SearchSettings settings){
        this.searchSettings = settings;
    }
    public void setCarOffers(List<CarOffer> carOffers){
        this.carOffers = carOffers;
    }
    public boolean canFilter(){
        return searchSettings.getDateFrom()!=null||searchSettings.getDateTo()!=null;
    }
    public List<CarOffer> filter(){
        List<CarOffer> filteredOffers = new ArrayList<>(carOffers);
        for(CarOffer offer: carOffers){
            if(searchSettings.getDateTo()!=null){
                if(offer.getDate().isAfter(searchSettings.getDateTo()))
                    filteredOffers.remove(offer);
            }
            if(searchSettings.getDateFrom()!=null){
                if(offer.getDate().isBefore(searchSettings.getDateFrom()))
                    filteredOffers.remove(offer);
            }
        }
        return filteredOffers;
    }
}
