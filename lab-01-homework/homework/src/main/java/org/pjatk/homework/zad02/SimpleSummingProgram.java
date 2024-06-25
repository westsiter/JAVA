package org.pjatk.homework.zad02;

public class SimpleSummingProgram {

    /*
        Użytkownik wprowadza z klawiatury serię liczb różnych od zero,
        zero natomiast jest sygnałem zakończenia wprowadzania danych.
        Napisz program, który obliczy sumę tych liczb
     */
    public static void main(String[] args){
    int sum = 0;
    for(int i = 0; i < args.length; i++){
      if(Integer.parseInt(args[i]) == 0){
          break;
      }
        sum += Integer.parseInt(args[i]);

    }
    System.out.print(sum);

    }
}
