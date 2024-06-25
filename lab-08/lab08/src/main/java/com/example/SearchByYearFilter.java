package com.example;

import java.util.ArrayList;
import java.util.List;

public class SearchByYearFilter implements Filter {
    private SearchSettings searchSettings;
    private List<CarOffer> carOffers;
    public void setSearchSettings(SearchSettings settings){
        this.searchSettings = settings;
    }
    public void setCarOffers(List<CarOffer> carOffers){
        this.carOffers = carOffers;
    }
   public boolean canFilter(){
        return searchSettings.getYearFrom()>0||searchSettings.getYearTo()>0;
    }
    public List<CarOffer> filter(){
        List<CarOffer> filteredOffers = new ArrayList<>(carOffers);
        for(CarOffer offer: carOffers){
            if(searchSettings.getYearTo()>0){
                if(offer.getYear()>searchSettings.getYearTo())
                    filteredOffers.remove(offer);
            }
            if(searchSettings.getYearFrom()>0){
                if(offer.getYear()<searchSettings.getYearFrom())
                    filteredOffers.remove(offer);
            }
        }
        return filteredOffers;
    }

}
