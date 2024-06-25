package com.example;

import java.util.ArrayList;
import java.util.List;

public class SearchByWordFilter implements Filter {
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
            if(!offer.getTitle().contains(searchSettings.getWord())){
                filteredOffers.remove(offer);
            }
        }
        return filteredOffers;
    }
}
