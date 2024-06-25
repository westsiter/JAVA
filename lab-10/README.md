# Zadanie

Twoim zadaniem jest zaimplementowanie prostego mechanizmu do zarządzania harmonogramem zadań. Biblioteka którą napiszesz może być wykorzystana jako framework w różnych projektach informatycznych.

Funkcjonalności biblioteki:
* prosty mechanizm do definiowania zadań (interfejs `Job` )
* proste definiowanie czasu kiedy, w jakich odstępach czasu i ile razy dane zadanie ma zostać wykonane (interfejs `JobScheduler` oraz klasa `SimpleJobScheduler`)
* reagowanie na zdarzenie zmiany czasu (klasa `TimeEvent`)
* działanie harmonogramu i jego zadań na oddzielnych wątkach


Wykorzystane wzorce projektowe:
* [Singleton](https://refactoring.guru/pl/design-patterns/singleton)
* [Obserwator](https://refactoring.guru/pl/design-patterns/observer)
