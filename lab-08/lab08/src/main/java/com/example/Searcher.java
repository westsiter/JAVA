package com.example;

import java.util.ArrayList;
import java.util.List;

public class Searcher {
    private List<Filter> filters = new ArrayList<>();
    public void addFilter(Filter filter){
         filters.add(filter);
    }
    public List<CarOffer> filter(List<CarOffer>carOffers, SearchSettings settings){
        List<CarOffer> filteredOffers = carOffers;
        for(Filter filter:filters){
            filter.setSearchSettings(settings);
            filter.setCarOffers(filteredOffers);
            filteredOffers=filter.filter();
        }
        return filteredOffers;
    }
}
