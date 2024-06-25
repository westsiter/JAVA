package org.pjatk.products;

import java.util.ArrayList;

public class DiscountCalculator {

    public ArrayList<Product> products;

    /*
        minimumPrice - cena minimalna, od której zaczyna się naliczanie rabatu
        percentage - liczba od 0 do 1, określająca jaki procent rabatu jest przyznany, np 0.1 to 10%
     */
    public void discountByPercentage(double minimumPrice,double percentage){
        int sum = 0;
        for(int i = 0; i < products.size(); i++) {
            sum += products.get(i).price;
        }
        if(sum >= minimumPrice){
            for(int i = 0; i < products.size(); i++){
                products.get(i).price = (1 - percentage)*products.get(i).price;
            }
        }
        }

    public void addFreeCompanyGlass(double minimumPrice){
        int sum = 0;
        for(int i = 0; i < products.size(); i++){
            sum += products.get(i).price;
        }

        if (sum >= minimumPrice){
            Product free = new Product();
            free.price = 0;
            free.name = "kupek";
            products.add(new Product() );
        }
    }

    public void threeForPriceOfTwo(){
        ProductsSorter.sort(products);
        for(int i = 0; i < products.size(); i++ ){
           if(products.get(i).price > 0){
               products.get(i).price = 0;
               break;
           }
        }
    }

}
