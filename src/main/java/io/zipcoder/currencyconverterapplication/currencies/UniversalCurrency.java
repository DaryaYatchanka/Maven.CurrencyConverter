package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    @Override
    public CurrencyType getSourceCurrency() {
        return CurrencyType.UNIVERSAL_CURRENCY;
    }
}
