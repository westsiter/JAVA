package com.example;

import java.util.ArrayList;
import java.util.List;

public class SearchByPriceFilter implements Filter {
    private SearchSettings searchSettings;
    private List<CarOffer> carOffers;
    public void setSearchSettings(SearchSettings settings){
        this.searchSettings = settings;
    }
    public void setCarOffers(List<CarOffer> carOffers){
        this.carOffers = carOffers;
    }
    public boolean canFilter(){
        return searchSettings.getPriceFrom()>0||searchSettings.getPriceTo()>0;
    }
    public List<CarOffer> filter(){
        List<CarOffer> filteredOffers = new ArrayList<>(carOffers);
        for(CarOffer offer: carOffers){
            if(searchSettings.getPriceTo()>0){
                if(offer.getPrice()>searchSettings.getPriceTo())
                    filteredOffers.remove(offer);
            }
            if(searchSettings.getPriceFrom()>0){
                if(offer.getPrice()<searchSettings.getPriceFrom())
                    filteredOffers.remove(offer);
            }
        }
        return filteredOffers;
    }

}
