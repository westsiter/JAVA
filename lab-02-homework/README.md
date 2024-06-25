# Zadanie 1

Gromadzimy wode mineralna. Sa trzy rodzaje butelek: o pojemnosci 2 litry(duze), srednie o pojemnosci 1 litr oraz male o pojemnosci 0,5 litra. 
Stworzyc klase MyWater z metodami:

```
void addLarge(int) - dodaje do zapasu wody podana jako argument liczbe duzych butelek

void addMedium(int) - dodaje do zapasu wody podana jako argument liczbe srednich butelek

void addSmall(int) - dodaje do zapasu wody podana jako liczbe malych butelek
```

oraz z metodami umozliwaiajacymi uzyskanie informacji o tym ile jest kazdego rodzaju butelek oraz jaka jest laczna pojemnosc zgromadzonej wody.

Pojemnosci butelek (duzych, srednich, malych) przedstawic jako pola klasy.

Klase przetestowac dodajac do zapasu rozne liczby butelek wody i wyprawadzajac potem komunikat w rodzaju:
```
Mam teraz 6.5 litrow wody
duzych butelek: 2
srednich butelek: 1
malych butelek: 3
```

# Zadanie 2

Zdefiniowac klase Box, ktorej obiekty beda stanowic pudelka o zadanych rozmiarach (szerokosc, wysokosc).
Dostarczyc w tej klasie specjalnych metod laczenia pudelek:
* diagonalnie (zwraca pudelko o rozmiarach rownych sumie szerokosci i wysokosci laczonych pudelek) - nazwa metody joinDiagonal,
* poziomo (zwraca pudelko o rozmiarach rownych sumie szerokosci laczonych pudelek i wysokosci rownej maksimum z wysokosci pudelek) - nazwa metody joinHorizontal
* pionowo (zwraca pudelko o rozmiarach rownych sumie wysokosci laczonych pudelek i szerokosci rownej maksimum z szerokosci pudelek) - nazwa metody joinVertical

Przetestowac klase w nastepujacy sposob
* uzytkownik programu w dialogu wejsciowym wprowadza dowolna liczbe szerokosci pudelek
* wysokosc tych pudelek rowna jest 2*szerokosc
* wyprowadzic na konsole wielkosci (szerokosc, wysokosc) kazdego z pudelek
* polaczyc otrzymane pudelka w kombinacje diagonalne, wertykalne i horyzontalne i wyprowadzic na konsole ich rozmiary

