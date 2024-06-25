package org.pjatk.homework.zad03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class RingFieldProgram {

    /*
        Napisz program obliczający pole powierzchni pierścienia kołowego
        o promieniu zewnętrznym R i wewnętrznym r. Długości promieni użytkownik
        wprowadza z klawiatury. Program powinien zasygnalizować błędne dane
        i ponownie zapytać o potrzebną wartość.
     */

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj wartosc parametru R:");
        int R = 0;
        while (R == 0){

            try{
                 R = Integer.parseInt(reader.readLine());
            }
            catch (NumberFormatException | IOException e ){
                System.out.println("Wprowadz ponownie R:");
            }
        }

        System.out.println("Podaj wartosc parametru r:");
        int r = 0;
        while (r == 0){

            try{
                r = Integer.parseInt(reader.readLine());
            }
            catch (NumberFormatException | IOException e ){
                System.out.println("Wprowadz ponownie r:");
            }
        }
        double pole = Math.PI *R*R - Math.PI*r*r;
        System.out.println(pole);


    }
}
