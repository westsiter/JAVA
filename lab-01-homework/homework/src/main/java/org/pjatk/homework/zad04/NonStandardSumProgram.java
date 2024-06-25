package org.pjatk.homework.zad04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NonStandardSumProgram {

    /*
        Użytkownik wprowadza z klawiatury dwie liczby całkowite.
        Napisz program obliczający sumę tych liczb, korzystając
        z operatorów inkrementacji (++) i dekrementacji (--).
        Użycie operatora dodawania (+) jest zabronione.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj wartosc parametru a:");
        int a = Integer.parseInt(reader.readLine());
        int wynik = a;
        System.out.println("Podaj wartosc parametru b:");
        int b = Integer.parseInt(reader.readLine());

        for(int i = 0; i < b; i++){
            wynik++;
        }
        System.out.println(wynik);
    }
}
