package com.pjatk.pesel.model;

import java.util.regex.Pattern;

public class PeselValidator {
    public static boolean isValid(String pesel){

        /* Algorytm sprawdzający czy nr pesel jest prawidłowym numerem PESEL
        (sprawdzić poprzez wyrażenie regularne oraz sumę kontrolną) */
        if(!pesel.matches("\\d{11}")){
            return false;
        }
        int p = 0;

        int[] w = {1,3,7,9,1,3,7,9,1,3};
        for(int i = 0; i < 10; i++){
            int num = pesel.charAt(i) - 48;
            p += (w[i]*num)%10;
        }
        p= p%10;
        int wynik = 10 - p;
        int num = pesel.charAt(10) - 48;
        if (num == wynik){
            return true;
        }

        return false;
    }
}

