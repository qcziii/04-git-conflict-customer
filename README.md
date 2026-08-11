# 04 - Git: branch, pull request i konflikt

## Cel

Przećwiczyć cały proces pracy z branchem, pull requestem i ręcznym rozwiązaniem konfliktu.

## Scenariusz

Repozytorium startuje z jednym DTO i mapperem.

### Osoba A

1. Utwórz branch `feature/customer-phone-number`.
2. Dodaj pole `phoneNumber` do `Customer`.
3. Dodaj pole `phoneNumber` do `CustomerDto`.
4. Zaktualizuj `CustomerMapper`.
5. Dodaj test mapowania.
6. Zrób 2-3 logiczne commity.

### Osoba B

1. Utwórz branch `feature/customer-date-of-birth`.
2. Dodaj pole `dateOfBirth` do `Customer`.
3. Dodaj pole `dateOfBirth` do `CustomerDto`.
4. Zaktualizuj `CustomerMapper`.
5. Dodaj prostą walidację wieku i test.
6. Zrób 2-3 logiczne commity.

## Po merge pierwszego PR

Druga osoba aktualizuje branch, rozwiązuje konflikt i sprawdza:

- projekt się kompiluje,
- zmiany obu osób zostały zachowane,
- testy przechodzą,
- nie zniknęły importy, pola ani metody.

## Uruchomienie

```bash
mvn test
```

