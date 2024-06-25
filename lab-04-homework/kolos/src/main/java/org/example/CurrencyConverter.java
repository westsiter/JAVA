package org.example;

import java.util.Map;

public class CurrencyConverter {
    public static double PLN_TO_USD;
    public static double PLN_TO_EUR;
    public static double getConverter(Currency source, Currency target){
        Map<Currency, Double> map = Map.of(Currency.USD, PLN_TO_USD, Currency.EUR, PLN_TO_EUR, Currency.PLN, 1.0);
        return map.get(source)/map.get(target);
    }
    public static Money exchange(Wallet wallet, Currency currency){
        double sump = wallet.getValue(Currency.PLN);
        double sume = wallet.getValue(Currency.EUR);
        double sumu = wallet.getValue(Currency.USD);
        double sum = 0;
        sum += sump*getConverter(Currency.PLN, currency);
        sum += sume*getConverter(Currency.EUR, currency);
        sum += sumu*getConverter(Currency.USD, currency);
        return new Money(sum, currency);

    }

}
