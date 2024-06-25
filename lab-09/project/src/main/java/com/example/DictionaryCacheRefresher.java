package com.example;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class DictionaryCacheRefresher extends Thread{
    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep(5*1000);
                List<DictionaryValue> newValues = new DictionaryFileReader("src/main/resources/dictionaries.csv").getDictionaryValues();
                DictionaryCache.getInstance().setItems(newValues);
                System.out.println("ilość elementów wczytanych z pliku " + newValues.size());
            }
            catch (InterruptedException e) {
                break;
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }

}
