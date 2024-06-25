package org.example;

public class Main {
    public static void main(String[] args) {
        Money moneyP = new Money(10, Currency.PLN);
        Money moneyU = new Money(5, Currency.USD);
        Money moneyE = new Money(2, Currency.EUR);
        Wallet portfel = new Wallet();
        portfel.add(moneyP);
        portfel.add(moneyU);
        portfel.add(moneyE);
        System.out.println("Wartość zgromadzonych w portfelu złotych " + portfel.getValue(Currency.PLN));
        CurrencyConverter.PLN_TO_EUR = 5;
        CurrencyConverter.PLN_TO_USD = 4;
        System.out.println("Przelicznik dolara na euro " + CurrencyConverter.getConverter(Currency.USD, Currency.EUR));
        System.out.println("Wartość portfela w USD " + CurrencyConverter.exchange(portfel, Currency.USD).getValue());
    }

}