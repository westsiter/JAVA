# Zadanie (3 pkt)

Twoim zadaniem jest zaimplementowanie mechanizmu, który pozwoli na porównywanie ze sobą obiektów klas `Person` oraz `Address`

**Dwa obiekty uznajemy za takie same gdy:**
- wszystkie wartości pól w obiektach są takie same
- jeżeli pole jest referencją do innego obiektu lub kolekcji obiektów (klasa `Person` będzie miała referencję do `ArrayListy` obiektów klasy `Address`) to
  * wartości pól w referencjach także powinny być równe (tj. pola w poszczególnych adresach)

**W przeciwnym przypadku obiekty są różne.**

Aby rozwiązać to zadanie należy nadpisać metody `equals` `hashCode`  `toString`, które klasa dziedziczy po klasie `Object`

Warto wykorzystać klasę `StringBuilder` w implementacji metody `toString`
