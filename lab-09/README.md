# Zadanie

Twoim zadaniem jest zaimplementowanie mechanizmu do obsługi Cachowania danych w pamięci
aplikacji. Cache ma przechowywać dane słownikowe które składają się z:
* Id
* Klucza liczbowego
* Klucza w postaci tablicy znaków
* Nazwy słownika
* Wartości

Na przykład w takich słownikach możemy przetrzymywać nazwy województw, miast, państw, typy
adresów, role użytkowników itd
Przykładowo:

|ID |IntKey |StringKey |Value |EnumerationName|
|---|:-----:|--------|------|-----|
|1 |1 |POM    |Woj. Pomorskie           |  Region        |
|2 |2 |KUJPOM |Woj. Kujawsko-pomorskie  |  Region        |
|3 |3 |MAZ    |Woj. mazowieckie         |  Region        |
|4 |1 |GD     |Gdańsk                   |  City          |
|5 |2 |GDY    |Gdynia                   |  City          |
|6 |3 |SOP    |Sopot                    |  City          |
|7 |1 |ADR    |Adres zameldowania       |  AddressType   |
|8 |2 |CORESP |Adres korespondencyjny   |  AddressType   |
|9 |1 |ADM    |administrator            |  UserType      |
|10| 2| USR   |użytkownik               |  UserType      |

Dane słownikowe w systemach informatycznych bardzo rzadko zmieniają swoje wartości, więc nie ma
zazwyczaj potrzeby ciągłego pytania bazy danych nie – często przetrzymuje się je w pamięci
procesu aplikacji i odświeża co jakiś czas. Na chwilę obecną dane będą przechowywane w pliku
csv.

Wytyczne zadania:
* Wykorzystaj wzorzec ‘Singleton’ do implementacji klasy która będzie przechowywać dane
słownikowe (Cache)
* Odświeżanie danych w Cachu, ma następować co pewien okres czasu (np co 1 minutę)