package com.example;

import java.util.List;

public interface Filter {
    public void setSearchSettings(SearchSettings settings);
    public void setCarOffers(List<CarOffer> carOffers);
    public boolean canFilter();
    public List<CarOffer> filter();

}
