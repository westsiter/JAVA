package org.pjatk.homework.zad06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/*
    Napisz program który sprawdzi, czy wprowadzone zdanie
    jest palindromem, czyli brzmi tak samo czytane od strony lewej do prawej
    i od prawej do lewej.
    Przykład zdania-palindromu jest 'Kobyła ma mały bok' (bez rozróźniania wielkości
    liter i uwzględniania odstępów miezy słowami)
 */
public class PalindromProgram {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj tekst do sprawdzenia:");
        String pal = reader.readLine();
        pal = pal.toLowerCase(Locale.ROOT).strip();
        for(int i = 0; i < pal.length()/2; i++){
            if(pal.charAt(i) == pal.charAt(pal.length() - 1 - i)){
                continue;
            }
            else{
                System.out.println("To nie jest palindrom");
                return;
            }
        }
        System.out.println("To jest palindrom");
    }

}
