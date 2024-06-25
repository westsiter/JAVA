package org.example;
import java.util.ArrayList;


public class Wallet {
    private ArrayList<Money> money = new ArrayList<Money>();
    public void add(Money money){
        this.money.add(money);
    }
    public double getValue(Currency currency){
        double result = 0;
        for(Money m: money){
            if(m.getCurrency() == currency) {
                result += m.getValue();

            }
        }
        return result;
    }
    @Override
    public String toString() {
        return "W portfelu mam: " + this.getValue(Currency.PLN) + "PLN, " + this.getValue(Currency.EUR) + "EUR, " + this.getValue(Currency.USD) + "USD, ";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Wallet)) {
            return false;
        }
        return CurrencyConverter.exchange(this, Currency.USD).getValue() == CurrencyConverter.exchange((Wallet) obj, Currency.USD).getValue();
    }
}
