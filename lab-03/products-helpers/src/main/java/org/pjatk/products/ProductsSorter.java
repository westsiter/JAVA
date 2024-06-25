package org.pjatk.products;

import java.util.*;

public class ProductsSorter {

    //można wykorzystać algorytm sortowania przez wstawiania
    public static ArrayList<Product> sort(ArrayList<Product> products) {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.price - o2.price);
            }
        });
        return products;
    }



    public static Product mostExpensive(ArrayList<Product> products){
        Product product = null;
        for(int i = 0; i < products.size(); i++){
            if(product == null){
                product = products.get(i);
            }
            else if (products.get(i).price > product.price) {
                product = products.get(i);
            }
        }
        return product;
    }


    public static Product theCheapest(ArrayList<Product> products){
        Product product = null;
        for(int i = 0; i < products.size(); i++){
            if(product == null){
                product = products.get(i);
            }
            else if (products.get(i).price < product.price) {
                product = products.get(i);
            }
        }
        return product;
    }


    public static ArrayList<Product> theCheapest(ArrayList<Product> products, int n){
        ProductsSorter.sort(products);
        return new ArrayList<>(products.subList(0, n));


    }
}
