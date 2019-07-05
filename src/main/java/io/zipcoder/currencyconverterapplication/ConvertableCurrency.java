package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    CurrencyType getSourceCurrency();
    default Double convert(CurrencyType currencyType) {

        return currencyType.getRate()/getSourceCurrency().getRate();
    }
}
