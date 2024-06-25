package org.pjatk.homework.zad01;

public class AliceHaveCatsProgram {


    /*
        Użytkownik wprowadza z klawiatury liczbę kotów, które posiada pani Ala.
        Napisz program który poprawnie wyświetli zdanie typu 'Ala ma kota'

        np. dla liczby 1 - "Ala ma jednego kota"
            dla liczby 2 - "Ala ma 2 koty"
            dla liczby 9 - "Ala ma 9 kotów"
            dla liczby 23 - "Ala ma 23 koty"
            dla liczby 25 - "Ala ma 25 kotów"
            dla liczby 11 - "Ala ma 11 kotów"
            dla liczby 12 - "Ala ma 12 kotów"
            dla liczby 16 - "Ala ma 16 kotów"
            dla liczby 21 - "Ala ma 21 kotów"
            itd.
     */
    public static void main(String[] args){

        if(args.length != 1){
            System.out.println("Podaj jeden argument");
            return;
        }
        int kot = Integer.parseInt(args[0]);


        if(kot == 1){
            System.out.println("Ala ma jednego kota");
            return;
        }
        System.out.print("Ala ma " + kot);
        if(kot > 1 && kot < 5 || kot == 22 || kot == 23){
            System.out.println(" koty");
        }
        if(kot > 4 && kot < 22 || kot > 23){
            System.out.println(" kotów");
        }

    }


}
