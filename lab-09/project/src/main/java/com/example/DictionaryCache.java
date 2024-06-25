package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DictionaryCache {
    private static DictionaryCache instance;
    private List<DictionaryValue> items;
    private DictionaryCache() throws IOException {
        this.items = new DictionaryFileReader("src/main/resources/dictionaries.csv").getDictionaryValues();
    }
    public static DictionaryCache getInstance() throws IOException {
        if (instance == null){
            instance = new DictionaryCache();
        }
        return instance;
    }
    public void  setItems(List<DictionaryValue> items){
        this.items = items;
    }
}
