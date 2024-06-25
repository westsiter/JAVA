package org.pjatk.homework.zad05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Napisz program obliczający iloczyn dowolnej pary
    liczb całkowitych, nie korzystając z operatora *.
    Do dyspozycji masz operatory + i --.
 */
public class NonStandardMultiplierProgram {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj wartosc parametru a:");
        int a = Integer.parseInt(reader.readLine());
        int wynik = 0;
        System.out.println("Podaj wartosc parametru b:");
        int b = Integer.parseInt(reader.readLine());
        for(int i = 0; i < b; i++){
            wynik += a;
        }
        System.out.println(wynik);
    }
}
