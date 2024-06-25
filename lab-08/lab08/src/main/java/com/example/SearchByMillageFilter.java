package com.example;

import java.util.ArrayList;
import java.util.List;

public class SearchByMillageFilter implements Filter {
    private SearchSettings searchSettings;
    private List<CarOffer> carOffers;
    public void setSearchSettings(SearchSettings settings){
        this.searchSettings = settings;
    }
    public void setCarOffers(List<CarOffer> carOffers){
        this.carOffers = carOffers;
    }
    public boolean canFilter(){
        return searchSettings.getMillageFrom()>0||searchSettings.getMillageTo()>0;
    }
    public List<CarOffer> filter(){
        List<CarOffer> filteredOffers = new ArrayList<>(carOffers);
        for(CarOffer offer: carOffers){
            if(searchSettings.getMillageTo()>0){
                if(offer.getMillage()>searchSettings.getMillageTo())
                    filteredOffers.remove(offer);
            }
            if(searchSettings.getMillageFrom()>0){
                if(offer.getMillage()<searchSettings.getMillageFrom())
                    filteredOffers.remove(offer);
            }
        }
        return filteredOffers;
    }
}
