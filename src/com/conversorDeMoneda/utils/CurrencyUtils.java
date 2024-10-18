package com.conversorDeMoneda.utils;

import com.conversorDeMoneda.model.ExchangeRates;
import com.conversorDeMoneda.view.CurrencyView;

public class CurrencyUtils {

    public static void convertAndShowCurrency(CurrencyView view, ExchangeRates exchangeRates, String fromCurrency, String toCurrency, double amount) {
        double fromRate = exchangeRates.getRate(fromCurrency);
        double toRate = exchangeRates.getRate(toCurrency);
        double result = (amount / fromRate) * toRate;
        view.showConversionResult(fromCurrency, toCurrency, amount, result);
    }
}